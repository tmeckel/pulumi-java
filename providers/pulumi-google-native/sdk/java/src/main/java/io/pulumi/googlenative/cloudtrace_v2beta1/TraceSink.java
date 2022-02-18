// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtrace_v2beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudtrace_v2beta1.TraceSinkArgs;
import io.pulumi.googlenative.cloudtrace_v2beta1.outputs.OutputConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a sink that exports trace spans to a destination. The export of newly-ingested traces begins immediately, unless the sink's `writer_identity` is not permitted to write to the destination. A sink can export traces only from the resource owning the sink (the 'parent').
 * 
 */
@ResourceType(type="google-native:cloudtrace/v2beta1:TraceSink")
public class TraceSink extends io.pulumi.resources.CustomResource {
    /**
     * The canonical sink resource name, unique within the project. Must be of the form: project/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The canonical sink resource name, unique within the project. Must be of the form: project/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The export destination.
     * 
     */
    @OutputExport(name="outputConfig", type=OutputConfigResponse.class, parameters={})
    private Output<OutputConfigResponse> outputConfig;

    /**
     * @return The export destination.
     * 
     */
    public Output<OutputConfigResponse> getOutputConfig() {
        return this.outputConfig;
    }
    /**
     * A service account name for exporting the data. This field is set by sinks.create and sinks.update. The service account will need to be granted write access to the destination specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create tables and write data this account will need the dataEditor role. Read more about roles in the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.: "service-00000001@00000002.iam.gserviceaccount.com"
     * 
     */
    @OutputExport(name="writerIdentity", type=String.class, parameters={})
    private Output<String> writerIdentity;

    /**
     * @return A service account name for exporting the data. This field is set by sinks.create and sinks.update. The service account will need to be granted write access to the destination specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create tables and write data this account will need the dataEditor role. Read more about roles in the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.: "service-00000001@00000002.iam.gserviceaccount.com"
     * 
     */
    public Output<String> getWriterIdentity() {
        return this.writerIdentity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TraceSink(String name, TraceSinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtrace/v2beta1:TraceSink", name, args == null ? TraceSinkArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TraceSink(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtrace/v2beta1:TraceSink", name, null, makeResourceOptions(options, id));
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
    public static TraceSink get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TraceSink(name, id, options);
    }
}
