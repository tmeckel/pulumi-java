// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.testing_v1.TestMatrixArgs;
import io.pulumi.googlenative.testing_v1.outputs.ClientInfoResponse;
import io.pulumi.googlenative.testing_v1.outputs.EnvironmentMatrixResponse;
import io.pulumi.googlenative.testing_v1.outputs.ResultStorageResponse;
import io.pulumi.googlenative.testing_v1.outputs.TestExecutionResponse;
import io.pulumi.googlenative.testing_v1.outputs.TestSpecificationResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates and runs a matrix of tests according to the given specifications. Unsupported environments will be returned in the state UNSUPPORTED. A test matrix is limited to use at most 2000 devices in parallel. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed or if the matrix tries to use too many simultaneous devices.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:testing/v1:TestMatrix")
public class TestMatrix extends io.pulumi.resources.CustomResource {
    /**
     * Information about the client which invoked the test.
     * 
     */
    @OutputExport(name="clientInfo", type=ClientInfoResponse.class, parameters={})
    private Output<ClientInfoResponse> clientInfo;

    /**
     * @return Information about the client which invoked the test.
     * 
     */
    public Output<ClientInfoResponse> getClientInfo() {
        return this.clientInfo;
    }
    /**
     * The devices the tests are being executed on.
     * 
     */
    @OutputExport(name="environmentMatrix", type=EnvironmentMatrixResponse.class, parameters={})
    private Output<EnvironmentMatrixResponse> environmentMatrix;

    /**
     * @return The devices the tests are being executed on.
     * 
     */
    public Output<EnvironmentMatrixResponse> getEnvironmentMatrix() {
        return this.environmentMatrix;
    }
    /**
     * If true, only a single attempt at most will be made to run each execution/shard in the matrix. Flaky test attempts are not affected. Normally, 2 or more attempts are made if a potential infrastructure issue is detected. This feature is for latency sensitive workloads. The incidence of execution failures may be significantly greater for fail-fast matrices and support is more limited because of that expectation.
     * 
     */
    @OutputExport(name="failFast", type=Boolean.class, parameters={})
    private Output<Boolean> failFast;

    /**
     * @return If true, only a single attempt at most will be made to run each execution/shard in the matrix. Flaky test attempts are not affected. Normally, 2 or more attempts are made if a potential infrastructure issue is detected. This feature is for latency sensitive workloads. The incidence of execution failures may be significantly greater for fail-fast matrices and support is more limited because of that expectation.
     * 
     */
    public Output<Boolean> getFailFast() {
        return this.failFast;
    }
    /**
     * The number of times a TestExecution should be re-attempted if one or more of its test cases fail for any reason. The maximum number of reruns allowed is 10. Default is 0, which implies no reruns.
     * 
     */
    @OutputExport(name="flakyTestAttempts", type=Integer.class, parameters={})
    private Output<Integer> flakyTestAttempts;

    /**
     * @return The number of times a TestExecution should be re-attempted if one or more of its test cases fail for any reason. The maximum number of reruns allowed is 10. Default is 0, which implies no reruns.
     * 
     */
    public Output<Integer> getFlakyTestAttempts() {
        return this.flakyTestAttempts;
    }
    /**
     * Describes why the matrix is considered invalid. Only useful for matrices in the INVALID state.
     * 
     */
    @OutputExport(name="invalidMatrixDetails", type=String.class, parameters={})
    private Output<String> invalidMatrixDetails;

    /**
     * @return Describes why the matrix is considered invalid. Only useful for matrices in the INVALID state.
     * 
     */
    public Output<String> getInvalidMatrixDetails() {
        return this.invalidMatrixDetails;
    }
    /**
     * Output Only. The overall outcome of the test. Only set when the test matrix state is FINISHED.
     * 
     */
    @OutputExport(name="outcomeSummary", type=String.class, parameters={})
    private Output<String> outcomeSummary;

    /**
     * @return Output Only. The overall outcome of the test. Only set when the test matrix state is FINISHED.
     * 
     */
    public Output<String> getOutcomeSummary() {
        return this.outcomeSummary;
    }
    /**
     * The cloud project that owns the test matrix.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The cloud project that owns the test matrix.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Where the results for the matrix are written.
     * 
     */
    @OutputExport(name="resultStorage", type=ResultStorageResponse.class, parameters={})
    private Output<ResultStorageResponse> resultStorage;

    /**
     * @return Where the results for the matrix are written.
     * 
     */
    public Output<ResultStorageResponse> getResultStorage() {
        return this.resultStorage;
    }
    /**
     * Indicates the current progress of the test matrix.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Indicates the current progress of the test matrix.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The list of test executions that the service creates for this matrix.
     * 
     */
    @OutputExport(name="testExecutions", type=List.class, parameters={TestExecutionResponse.class})
    private Output<List<TestExecutionResponse>> testExecutions;

    /**
     * @return The list of test executions that the service creates for this matrix.
     * 
     */
    public Output<List<TestExecutionResponse>> getTestExecutions() {
        return this.testExecutions;
    }
    /**
     * Unique id set by the service.
     * 
     */
    @OutputExport(name="testMatrixId", type=String.class, parameters={})
    private Output<String> testMatrixId;

    /**
     * @return Unique id set by the service.
     * 
     */
    public Output<String> getTestMatrixId() {
        return this.testMatrixId;
    }
    /**
     * How to run the test.
     * 
     */
    @OutputExport(name="testSpecification", type=TestSpecificationResponse.class, parameters={})
    private Output<TestSpecificationResponse> testSpecification;

    /**
     * @return How to run the test.
     * 
     */
    public Output<TestSpecificationResponse> getTestSpecification() {
        return this.testSpecification;
    }
    /**
     * The time this test matrix was initially created.
     * 
     */
    @OutputExport(name="timestamp", type=String.class, parameters={})
    private Output<String> timestamp;

    /**
     * @return The time this test matrix was initially created.
     * 
     */
    public Output<String> getTimestamp() {
        return this.timestamp;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TestMatrix(String name, TestMatrixArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:testing/v1:TestMatrix", name, args == null ? TestMatrixArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TestMatrix(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:testing/v1:TestMatrix", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TestMatrix get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TestMatrix(name, id, options);
    }
}
