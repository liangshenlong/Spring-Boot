package cn.hacz.edu.webexception;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * project - spring boot
 *
 * @author guod
 * @date 日期:2017年10月31日 时间:下午8:59:47
 * @JDK:version used:jdk1.8
 * @version 3.0
 * @Description 功能模块：基于Twitter的snowFlake算法的ID生成器
 */
@Component
@ConfigurationProperties("makai.utils.id")
public class SnowFlakeIdGenerator {

	private long workerId;
	private long datacenterId;

	private long twepoch = 1288834974657L;

	private long workerIdBits = 5L;
	private long datacenterIdBits = 5L;
	private long maxWorkerId = -1L ^ (-1L << workerIdBits);
	private long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);
	private long sequenceBits = 12L;

	private long workerIdShift = sequenceBits;
	private long datacenterIdShift = sequenceBits + workerIdBits;
	private long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;
	private long sequenceMask = -1L ^ (-1L << sequenceBits);

	private volatile long sequence = 0L;
	private volatile long lastTimestamp = -1L;

	public synchronized long generateLongId() {
		long timestamp = System.currentTimeMillis();

		if (timestamp < lastTimestamp) {
			throw new RuntimeException(
					String.format("时钟竟然倒退了，如何生成ID。老大你在逗我玩吗？拒绝为 %d 秒生成ID", lastTimestamp - timestamp));
		}

		if (lastTimestamp == timestamp) {
			sequence = (sequence + 1) & sequenceMask;
			if (sequence == 0) {
				timestamp = tilNextMillis(lastTimestamp);
			}
		} else {
			sequence = 0L;
		}

		lastTimestamp = timestamp;

		return ((timestamp - twepoch) << timestampLeftShift) | (datacenterId << datacenterIdShift)
				| (workerId << workerIdShift) | sequence;
	}

	protected long tilNextMillis(long lastTimestamp) {
		long timestamp = System.currentTimeMillis();
		while (timestamp <= lastTimestamp) {
			timestamp = System.currentTimeMillis();
		}
		return timestamp;
	}

	public long getWorkerId() {
		return workerId;
	}

	public void setWorkerId(long workerId) {
		if (workerId > maxWorkerId || workerId < 0) {
			throw new IllegalArgumentException(String.format("节点ID必须在 0 和 %d 之间", maxWorkerId));
		}
		this.workerId = workerId;
	}

	public long getDatacenterId() {
		return datacenterId;
	}

	public void setDatacenterId(long datacenterId) {
		if (datacenterId > maxDatacenterId || datacenterId < 0)
			throw new IllegalArgumentException(String.format("数据中心ID必须在 0 和 %d 之间 ", maxDatacenterId));
		this.datacenterId = datacenterId;
	}
}
