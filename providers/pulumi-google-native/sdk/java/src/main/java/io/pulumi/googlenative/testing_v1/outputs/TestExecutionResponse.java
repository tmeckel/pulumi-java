// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.EnvironmentResponse;
import io.pulumi.googlenative.testing_v1.outputs.ShardResponse;
import io.pulumi.googlenative.testing_v1.outputs.TestDetailsResponse;
import io.pulumi.googlenative.testing_v1.outputs.TestSpecificationResponse;
import io.pulumi.googlenative.testing_v1.outputs.ToolResultsStepResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TestExecutionResponse {
    /**
     * How the host machine(s) are configured.
     * 
     */
    private final EnvironmentResponse environment;
    /**
     * Id of the containing TestMatrix.
     * 
     */
    private final String matrixId;
    /**
     * The cloud project that owns the test execution.
     * 
     */
    private final String project;
    /**
     * Details about the shard.
     * 
     */
    private final ShardResponse shard;
    /**
     * Indicates the current progress of the test execution (e.g., FINISHED).
     * 
     */
    private final String state;
    /**
     * Additional details about the running test.
     * 
     */
    private final TestDetailsResponse testDetails;
    /**
     * How to run the test.
     * 
     */
    private final TestSpecificationResponse testSpecification;
    /**
     * The time this test execution was initially created.
     * 
     */
    private final String timestamp;
    /**
     * Where the results for this execution are written.
     * 
     */
    private final ToolResultsStepResponse toolResultsStep;

    @OutputCustomType.Constructor({"environment","matrixId","project","shard","state","testDetails","testSpecification","timestamp","toolResultsStep"})
    private TestExecutionResponse(
        EnvironmentResponse environment,
        String matrixId,
        String project,
        ShardResponse shard,
        String state,
        TestDetailsResponse testDetails,
        TestSpecificationResponse testSpecification,
        String timestamp,
        ToolResultsStepResponse toolResultsStep) {
        this.environment = Objects.requireNonNull(environment);
        this.matrixId = Objects.requireNonNull(matrixId);
        this.project = Objects.requireNonNull(project);
        this.shard = Objects.requireNonNull(shard);
        this.state = Objects.requireNonNull(state);
        this.testDetails = Objects.requireNonNull(testDetails);
        this.testSpecification = Objects.requireNonNull(testSpecification);
        this.timestamp = Objects.requireNonNull(timestamp);
        this.toolResultsStep = Objects.requireNonNull(toolResultsStep);
    }

    /**
     * How the host machine(s) are configured.
     * 
     */
    public EnvironmentResponse getEnvironment() {
        return this.environment;
    }
    /**
     * Id of the containing TestMatrix.
     * 
     */
    public String getMatrixId() {
        return this.matrixId;
    }
    /**
     * The cloud project that owns the test execution.
     * 
     */
    public String getProject() {
        return this.project;
    }
    /**
     * Details about the shard.
     * 
     */
    public ShardResponse getShard() {
        return this.shard;
    }
    /**
     * Indicates the current progress of the test execution (e.g., FINISHED).
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Additional details about the running test.
     * 
     */
    public TestDetailsResponse getTestDetails() {
        return this.testDetails;
    }
    /**
     * How to run the test.
     * 
     */
    public TestSpecificationResponse getTestSpecification() {
        return this.testSpecification;
    }
    /**
     * The time this test execution was initially created.
     * 
     */
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * Where the results for this execution are written.
     * 
     */
    public ToolResultsStepResponse getToolResultsStep() {
        return this.toolResultsStep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestExecutionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentResponse environment;
        private String matrixId;
        private String project;
        private ShardResponse shard;
        private String state;
        private TestDetailsResponse testDetails;
        private TestSpecificationResponse testSpecification;
        private String timestamp;
        private ToolResultsStepResponse toolResultsStep;

        public Builder() {
    	      // Empty
        }

        public Builder(TestExecutionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.matrixId = defaults.matrixId;
    	      this.project = defaults.project;
    	      this.shard = defaults.shard;
    	      this.state = defaults.state;
    	      this.testDetails = defaults.testDetails;
    	      this.testSpecification = defaults.testSpecification;
    	      this.timestamp = defaults.timestamp;
    	      this.toolResultsStep = defaults.toolResultsStep;
        }

        public Builder setEnvironment(EnvironmentResponse environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setMatrixId(String matrixId) {
            this.matrixId = Objects.requireNonNull(matrixId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setShard(ShardResponse shard) {
            this.shard = Objects.requireNonNull(shard);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTestDetails(TestDetailsResponse testDetails) {
            this.testDetails = Objects.requireNonNull(testDetails);
            return this;
        }

        public Builder setTestSpecification(TestSpecificationResponse testSpecification) {
            this.testSpecification = Objects.requireNonNull(testSpecification);
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder setToolResultsStep(ToolResultsStepResponse toolResultsStep) {
            this.toolResultsStep = Objects.requireNonNull(toolResultsStep);
            return this;
        }

        public TestExecutionResponse build() {
            return new TestExecutionResponse(environment, matrixId, project, shard, state, testDetails, testSpecification, timestamp, toolResultsStep);
        }
    }
}
