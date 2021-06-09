package com.practice.algos;

/**
 * It will defang the ip address
 *
 * Input: 1.1.1.1
 * Output: 1[.]1[.]1[.]1
 *
 * Input: 242.81.91.121
 * Output: 242[.]81[.]91[.]121
 */
public class DefangingIPAddress {
    public static void main(String[] args) {
        String ipAddress1 = "1.1.1.1";
        System.out.println(ipAddress1+" defangIp => " + defangIPAddress(ipAddress1));

        String ipAddress2 = "242.81.61.121";
        System.out.println(ipAddress2+" defangIp => " + defangIPAddress(ipAddress2));
    }

    private static String defangIPAddress(String ipAddress) {
        if(ipAddress == null || ipAddress.isEmpty()) {
            return "";
        } else {
            StringBuffer defangIP = new StringBuffer();
            for(int index=0; index < ipAddress.length(); index++) {
                char ipChar = ipAddress.charAt(index);
                if(ipChar == '.') {
                    defangIP.append("[.]");
                } else {
                    defangIP.append(ipChar);
                }
            }

            return defangIP.toString();
        }
    }
}
