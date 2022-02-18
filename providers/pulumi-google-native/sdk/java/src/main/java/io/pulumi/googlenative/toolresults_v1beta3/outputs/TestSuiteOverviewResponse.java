// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.DurationResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.FileReferenceResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TestSuiteOverviewResponse {
    /**
     * Elapsed time of test suite.
     * 
     */
    private final DurationResponse elapsedTime;
    /**
     * Number of test cases in error, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never
     * 
     */
    private final Integer errorCount;
    /**
     * Number of failed test cases, typically set by the service by parsing the xml_source. May also be set by the user. - In create/response: always set - In update request: never
     * 
     */
    private final Integer failureCount;
    /**
     * Number of flaky test cases, set by the service by rolling up flaky test attempts. Present only for rollup test suite overview at environment level. A step cannot have flaky test cases.
     * 
     */
    private final Integer flakyCount;
    /**
     * The name of the test suite. - In create/response: always set - In update request: never
     * 
     */
    private final String name;
    /**
     * Number of test cases not run, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never
     * 
     */
    private final Integer skippedCount;
    /**
     * Number of test cases, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never
     * 
     */
    private final Integer totalCount;
    /**
     * If this test suite was parsed from XML, this is the URI where the original XML file is stored. Note: Multiple test suites can share the same xml_source Returns INVALID_ARGUMENT if the uri format is not supported. - In create/response: optional - In update request: never
     * 
     */
    private final FileReferenceResponse xmlSource;

    @OutputCustomType.Constructor({"elapsedTime","errorCount","failureCount","flakyCount","name","skippedCount","totalCount","xmlSource"})
    private TestSuiteOverviewResponse(
        DurationResponse elapsedTime,
        Integer errorCount,
        Integer failureCount,
        Integer flakyCount,
        String name,
        Integer skippedCount,
        Integer totalCount,
        FileReferenceResponse xmlSource) {
        this.elapsedTime = Objects.requireNonNull(elapsedTime);
        this.errorCount = Objects.requireNonNull(errorCount);
        this.failureCount = Objects.requireNonNull(failureCount);
        this.flakyCount = Objects.requireNonNull(flakyCount);
        this.name = Objects.requireNonNull(name);
        this.skippedCount = Objects.requireNonNull(skippedCount);
        this.totalCount = Objects.requireNonNull(totalCount);
        this.xmlSource = Objects.requireNonNull(xmlSource);
    }

    /**
     * Elapsed time of test suite.
     * 
     */
    public DurationResponse getElapsedTime() {
        return this.elapsedTime;
    }
    /**
     * Number of test cases in error, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never
     * 
     */
    public Integer getErrorCount() {
        return this.errorCount;
    }
    /**
     * Number of failed test cases, typically set by the service by parsing the xml_source. May also be set by the user. - In create/response: always set - In update request: never
     * 
     */
    public Integer getFailureCount() {
        return this.failureCount;
    }
    /**
     * Number of flaky test cases, set by the service by rolling up flaky test attempts. Present only for rollup test suite overview at environment level. A step cannot have flaky test cases.
     * 
     */
    public Integer getFlakyCount() {
        return this.flakyCount;
    }
    /**
     * The name of the test suite. - In create/response: always set - In update request: never
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Number of test cases not run, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never
     * 
     */
    public Integer getSkippedCount() {
        return this.skippedCount;
    }
    /**
     * Number of test cases, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never
     * 
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }
    /**
     * If this test suite was parsed from XML, this is the URI where the original XML file is stored. Note: Multiple test suites can share the same xml_source Returns INVALID_ARGUMENT if the uri format is not supported. - In create/response: optional - In update request: never
     * 
     */
    public FileReferenceResponse getXmlSource() {
        return this.xmlSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestSuiteOverviewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse elapsedTime;
        private Integer errorCount;
        private Integer failureCount;
        private Integer flakyCount;
        private String name;
        private Integer skippedCount;
        private Integer totalCount;
        private FileReferenceResponse xmlSource;

        public Builder() {
    	      // Empty
        }

        public Builder(TestSuiteOverviewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elapsedTime = defaults.elapsedTime;
    	      this.errorCount = defaults.errorCount;
    	      this.failureCount = defaults.failureCount;
    	      this.flakyCount = defaults.flakyCount;
    	      this.name = defaults.name;
    	      this.skippedCount = defaults.skippedCount;
    	      this.totalCount = defaults.totalCount;
    	      this.xmlSource = defaults.xmlSource;
        }

        public Builder setElapsedTime(DurationResponse elapsedTime) {
            this.elapsedTime = Objects.requireNonNull(elapsedTime);
            return this;
        }

        public Builder setErrorCount(Integer errorCount) {
            this.errorCount = Objects.requireNonNull(errorCount);
            return this;
        }

        public Builder setFailureCount(Integer failureCount) {
            this.failureCount = Objects.requireNonNull(failureCount);
            return this;
        }

        public Builder setFlakyCount(Integer flakyCount) {
            this.flakyCount = Objects.requireNonNull(flakyCount);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSkippedCount(Integer skippedCount) {
            this.skippedCount = Objects.requireNonNull(skippedCount);
            return this;
        }

        public Builder setTotalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }

        public Builder setXmlSource(FileReferenceResponse xmlSource) {
            this.xmlSource = Objects.requireNonNull(xmlSource);
            return this;
        }

        public TestSuiteOverviewResponse build() {
            return new TestSuiteOverviewResponse(elapsedTime, errorCount, failureCount, flakyCount, name, skippedCount, totalCount, xmlSource);
        }
    }
}
