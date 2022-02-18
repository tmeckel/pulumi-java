// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.QueryArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AsyncQueryResultResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1QueryMetadataResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Submit a query to be processed in the background. If the submission of the query succeeds, the API returns a 201 status and an ID that refer to the query. In addition to the HTTP status 201, the `state` of "enqueued" means that the request succeeded.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Query")
public class Query extends io.pulumi.resources.CustomResource {
    /**
     * Creation time of the query.
     * 
     */
    @OutputExport(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return Creation time of the query.
     * 
     */
    public Output<String> getCreated() {
        return this.created;
    }
    /**
     * Hostname is available only when query is executed at host level.
     * 
     */
    @OutputExport(name="envgroupHostname", type=String.class, parameters={})
    private Output<String> envgroupHostname;

    /**
     * @return Hostname is available only when query is executed at host level.
     * 
     */
    public Output<String> getEnvgroupHostname() {
        return this.envgroupHostname;
    }
    /**
     * Error is set when query fails.
     * 
     */
    @OutputExport(name="error", type=String.class, parameters={})
    private Output<String> error;

    /**
     * @return Error is set when query fails.
     * 
     */
    public Output<String> getError() {
        return this.error;
    }
    /**
     * ExecutionTime is available only after the query is completed.
     * 
     */
    @OutputExport(name="executionTime", type=String.class, parameters={})
    private Output<String> executionTime;

    /**
     * @return ExecutionTime is available only after the query is completed.
     * 
     */
    public Output<String> getExecutionTime() {
        return this.executionTime;
    }
    /**
     * Asynchronous Query Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Asynchronous Query Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Contains information like metrics, dimenstions etc of the AsyncQuery.
     * 
     */
    @OutputExport(name="queryParams", type=GoogleCloudApigeeV1QueryMetadataResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1QueryMetadataResponse> queryParams;

    /**
     * @return Contains information like metrics, dimenstions etc of the AsyncQuery.
     * 
     */
    public Output<GoogleCloudApigeeV1QueryMetadataResponse> getQueryParams() {
        return this.queryParams;
    }
    /**
     * Asynchronous Report ID.
     * 
     */
    @OutputExport(name="reportDefinitionId", type=String.class, parameters={})
    private Output<String> reportDefinitionId;

    /**
     * @return Asynchronous Report ID.
     * 
     */
    public Output<String> getReportDefinitionId() {
        return this.reportDefinitionId;
    }
    /**
     * Result is available only after the query is completed.
     * 
     */
    @OutputExport(name="result", type=GoogleCloudApigeeV1AsyncQueryResultResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1AsyncQueryResultResponse> result;

    /**
     * @return Result is available only after the query is completed.
     * 
     */
    public Output<GoogleCloudApigeeV1AsyncQueryResultResponse> getResult() {
        return this.result;
    }
    /**
     * ResultFileSize is available only after the query is completed.
     * 
     */
    @OutputExport(name="resultFileSize", type=String.class, parameters={})
    private Output<String> resultFileSize;

    /**
     * @return ResultFileSize is available only after the query is completed.
     * 
     */
    public Output<String> getResultFileSize() {
        return this.resultFileSize;
    }
    /**
     * ResultRows is available only after the query is completed.
     * 
     */
    @OutputExport(name="resultRows", type=String.class, parameters={})
    private Output<String> resultRows;

    /**
     * @return ResultRows is available only after the query is completed.
     * 
     */
    public Output<String> getResultRows() {
        return this.resultRows;
    }
    /**
     * Self link of the query. Example: `/organizations/myorg/environments/myenv/queries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd` or following format if query is running at host level: `/organizations/myorg/hostQueries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
     */
    @OutputExport(name="self", type=String.class, parameters={})
    private Output<String> self;

    /**
     * @return Self link of the query. Example: `/organizations/myorg/environments/myenv/queries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd` or following format if query is running at host level: `/organizations/myorg/hostQueries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
     */
    public Output<String> getSelf() {
        return this.self;
    }
    /**
     * Query state could be "enqueued", "running", "completed", "failed".
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Query state could be "enqueued", "running", "completed", "failed".
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Last updated timestamp for the query.
     * 
     */
    @OutputExport(name="updated", type=String.class, parameters={})
    private Output<String> updated;

    /**
     * @return Last updated timestamp for the query.
     * 
     */
    public Output<String> getUpdated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Query(String name, QueryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Query", name, args == null ? QueryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Query(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Query", name, null, makeResourceOptions(options, id));
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
    public static Query get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Query(name, id, options);
    }
}
