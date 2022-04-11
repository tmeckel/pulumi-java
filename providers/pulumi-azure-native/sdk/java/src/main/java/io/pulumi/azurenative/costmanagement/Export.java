// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.ExportArgs;
import io.pulumi.azurenative.costmanagement.outputs.ExportDefinitionResponse;
import io.pulumi.azurenative.costmanagement.outputs.ExportDeliveryInfoResponse;
import io.pulumi.azurenative.costmanagement.outputs.ExportExecutionListResultResponse;
import io.pulumi.azurenative.costmanagement.outputs.ExportScheduleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An export resource.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:costmanagement:Export TestExport subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.CostManagement/exports/TestExport 
 * ```
 * 
 */
@ResourceType(type="azure-native:costmanagement:Export")
public class Export extends io.pulumi.resources.CustomResource {
    /**
     * Has the definition for the export.
     * 
     */
    @io.pulumi.core.annotations.Export(name="definition", type=ExportDefinitionResponse.class, parameters={})
    private Output<ExportDefinitionResponse> definition;

    /**
     * @return Has the definition for the export.
     * 
     */
    public Output<ExportDefinitionResponse> getDefinition() {
        return this.definition;
    }
    /**
     * Has delivery information for the export.
     * 
     */
    @io.pulumi.core.annotations.Export(name="deliveryInfo", type=ExportDeliveryInfoResponse.class, parameters={})
    private Output<ExportDeliveryInfoResponse> deliveryInfo;

    /**
     * @return Has delivery information for the export.
     * 
     */
    public Output<ExportDeliveryInfoResponse> getDeliveryInfo() {
        return this.deliveryInfo;
    }
    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @io.pulumi.core.annotations.Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * The format of the export being delivered. Currently only 'Csv' is supported.
     * 
     */
    @io.pulumi.core.annotations.Export(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    /**
     * @return The format of the export being delivered. Currently only 'Csv' is supported.
     * 
     */
    public Output</* @Nullable */ String> getFormat() {
        return this.format;
    }
    /**
     * Resource name.
     * 
     */
    @io.pulumi.core.annotations.Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * If the export has an active schedule, provides an estimate of the next execution time.
     * 
     */
    @io.pulumi.core.annotations.Export(name="nextRunTimeEstimate", type=String.class, parameters={})
    private Output<String> nextRunTimeEstimate;

    /**
     * @return If the export has an active schedule, provides an estimate of the next execution time.
     * 
     */
    public Output<String> getNextRunTimeEstimate() {
        return this.nextRunTimeEstimate;
    }
    /**
     * If requested, has the most recent execution history for the export.
     * 
     */
    @io.pulumi.core.annotations.Export(name="runHistory", type=ExportExecutionListResultResponse.class, parameters={})
    private Output</* @Nullable */ ExportExecutionListResultResponse> runHistory;

    /**
     * @return If requested, has the most recent execution history for the export.
     * 
     */
    public Output</* @Nullable */ ExportExecutionListResultResponse> getRunHistory() {
        return this.runHistory;
    }
    /**
     * Has schedule information for the export.
     * 
     */
    @io.pulumi.core.annotations.Export(name="schedule", type=ExportScheduleResponse.class, parameters={})
    private Output</* @Nullable */ ExportScheduleResponse> schedule;

    /**
     * @return Has schedule information for the export.
     * 
     */
    public Output</* @Nullable */ ExportScheduleResponse> getSchedule() {
        return this.schedule;
    }
    /**
     * Resource type.
     * 
     */
    @io.pulumi.core.annotations.Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Export(String name) {
        this(name, ExportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Export(String name, ExportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Export(String name, ExportArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:Export", name, args == null ? ExportArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Export(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:Export", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:costmanagement/v20190101:Export").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20190901:Export").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20191001:Export").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20191101:Export").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20200601:Export").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20201201preview:Export").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20210101:Export").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20211001:Export").build())
            ))
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
    public static Export get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Export(name, id, options);
    }
}
