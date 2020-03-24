package com.feri.job.tm;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 16:55
 */
@SpringBootApplication
@EnableTransactionManagerServer //启用Tx-LCN协调中心
public class TmApplication {
    public static void main(String[] args) {
        SpringApplication.run(TmApplication.class,args);
    }
}
