// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.documentation.apiScraper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Saves the API generated by CompleteApiScraper in a txt file.
 */
public final class ApiSaver {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiSaver.class);

    private ApiSaver() {

    }

    public static void main(String[] args) throws Exception {
        StringBuffer api = CompleteApiScraper.getApi();
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("API_file.txt")));
        writer.write(api.toString());
        writer.flush();
        writer.close();
        LOGGER.info("API file is ready!");
    }
}
