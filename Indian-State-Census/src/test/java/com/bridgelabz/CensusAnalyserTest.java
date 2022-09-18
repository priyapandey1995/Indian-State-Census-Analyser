package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CensusAnalyserTest {

    private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\pande\\OneDrive\\Documents\\Assignments_Batch_175\\Indian-State-Census\\Indian-State-Census-Analyser\\Indian-State-Census\\src\\test\\resources";


    @Test
    public void givenIndianCensusCSVFile_WhenCorrectPath_ShouldReturnCorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assertions.assertEquals(40, numOfRecords);
        } catch (CensusAnalyserException e) {
        }


       
    }
}
