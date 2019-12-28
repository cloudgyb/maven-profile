package com.gyb;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;

public class Test {
    public static void main(String[] args) {
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
        String name1 = operatingSystemMXBean.getName();
        System.out.println(name1);
        String version1 = operatingSystemMXBean.getVersion();
        System.out.println(version1);
        String arch = operatingSystemMXBean.getArch();
        System.out.println(arch);
        int availableProcessors = operatingSystemMXBean.getAvailableProcessors();
        System.out.println(availableProcessors);
        double systemLoadAverage = operatingSystemMXBean.getSystemLoadAverage();
        System.out.println(systemLoadAverage);
        String version = operatingSystemMXBean.getVersion();
        System.out.println(version);

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        String name = runtimeMXBean.getName();
        System.out.println(name);
        System.out.println(name.split("@")[0]);
        System.out.println(runtimeMXBean.getSpecName());
    }
}
