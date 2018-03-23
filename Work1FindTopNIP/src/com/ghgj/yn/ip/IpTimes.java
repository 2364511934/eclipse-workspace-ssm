package com.ghgj.yn.ip;

public class IpTimes implements Comparable<IpTimes> {
	private String ip;
	private int times;
	
	public IpTimes(String ip, int times) {
		this.ip = ip;
		this.times = times;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	@Override
	public String toString() {
		return "IpTimes [ip=" + ip + ",     times=" + times + "]";
	}
	@Override
	public int compareTo(IpTimes o) {
		return o.times - this.times;
	}
}
