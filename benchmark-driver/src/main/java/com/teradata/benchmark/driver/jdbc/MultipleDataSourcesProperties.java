/*
 * Copyright 2015, Teradata, Inc. All rights reserved.
 */
package com.teradata.benchmark.driver.jdbc;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import java.util.HashMap;
import java.util.Map;

public class MultipleDataSourcesProperties {

    private Map<String, DataSourceProperties> dataSources = new HashMap<>();

    public Map<String, DataSourceProperties> getDataSources() {
        return dataSources;
    }
}
