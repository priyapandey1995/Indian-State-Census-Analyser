package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CensusAnalyserTest {

    private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\pande\\OneDrive\\Documents\\Assignments_Batch_175\\Indian-State-Census\\Indian-State-Census-Analyser\\Indian-State-Census\\src\\test\\resources";
    private static final String INDIA_STATE_CODE_CSV = "C:\\Users\\pande\\OneDrive\\Documents\\Assignments_Batch_175\\Indian-State-Census\\Indian-State-Census-Analyser\\Indian-State-Census\\src\\test\\resources\\IndiaStateCode.csv";

    @Test
    public void givenIndianCensusCSVFile_WhenCorrectPath_ShouldReturnCorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assertions.assertEquals(40, numOfRecords);
        } catch (CensusAnalyserException e) {
        }
    }

        @Test
        public void givenIndiaStateCodeCSVFile_WhenCorrectPath_ShouldReturnsCorrectRecords()
        {
            try
            {
                CensusAnalyser censusAnalyser = new CensusAnalyser();
                int numOfRecords = censusAnalyser.loadIndianStateCode(INDIA_STATE_CODE_CSV);
                Assertions.assertEquals(37,numOfRecords);
            }
            catch (CensusAnalyserException e) { }
        }

    @Test
    public void givenIndianStateCodeCSVFile_WhenWithWrongFilePath_ShouldThrowException()
    {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        ExpectedException exceptionRule =  ExpectedException.none();
        exceptionRule.expect(CensusAnalyserException.class);
        try
        {
            censusAnalyser.loadIndianStateCode(WRONG_STATE_CODE_CSV_PATH);
        }
        catch (CensusAnalyserException e)
        {
            Assertions.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
            e.printStackTrace();
        }
    }



    }
}
