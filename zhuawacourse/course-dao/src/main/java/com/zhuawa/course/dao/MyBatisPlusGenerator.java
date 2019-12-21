package com.zhuawa.course.dao;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Author: jujinquan
 * @Date: 2019/12/9 15:06
 * 此类用于生成数据库中的文件
 */
public class MyBatisPlusGenerator {

    public static void main(String[] args) {
        //1. 全局配置
        GlobalConfig config = new GlobalConfig();
        // 是否支持AR模式
        config.setActiveRecord(true)
                .setAuthor("mybatis-plus")
                .setOutputDir("D:/jujinquan/course/mybatisPlus")
                // 文件覆盖
                .setFileOverride(true)
                // 主键策略
                .setIdType(IdType.AUTO)
                // 设置生成的service接口的名字的首字母是否为I，如IEmployeeService
                .setServiceName("%sService")
                // 生成基本的resultMap
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                // 生成基本的SQL片段p
                .setEnableCache(false);

        // 2. 数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)
                // 设置数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/effectdb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=true")
                .setUsername("root")
                .setPassword("123456");

        // 3. 策略配置globalConfiguration中
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true)
                // 全局大写命名
                // .setDbColumnUnderline(true)
                // 指定表名 字段名是否使用下划线
                // 数据库表映射到实体的命名策略
                .setNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix("tb_")
                // 表的前缀
                .setInclude("role")
                .setEntityLombokModel(false)
                .setRestControllerStyle(true);

        // 4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.zhuawa.course.dao.role")
                // dao
                .setMapper("dao")
                // servcie
//                .setService("service")
                // controller
//                .setController("controller")
                .setEntity("entity")
                // mapper.xml
                .setXml("mapper");

        // 5. 整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        // 6. 执行
        ag.execute();

    }
}
