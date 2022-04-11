// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.RunbookArgs;
import io.pulumi.azurenative.automation.outputs.ContentLinkResponse;
import io.pulumi.azurenative.automation.outputs.RunbookDraftResponse;
import io.pulumi.azurenative.automation.outputs.RunbookParameterResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Definition of the runbook type.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:Runbook Get-AzureVMTutorial /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/ContoseAutomationAccount/runbooks/Get-AzureVMTutorial 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:Runbook")
public class Runbook extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return Gets or sets the creation time.
     * 
     */
    public Output</* @Nullable */ String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Gets or sets the draft runbook properties.
     * 
     */
    @Export(name="draft", type=RunbookDraftResponse.class, parameters={})
    private Output</* @Nullable */ RunbookDraftResponse> draft;

    /**
     * @return Gets or sets the draft runbook properties.
     * 
     */
    public Output</* @Nullable */ RunbookDraftResponse> getDraft() {
        return this.draft;
    }
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Gets or sets the job count of the runbook.
     * 
     */
    @Export(name="jobCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> jobCount;

    /**
     * @return Gets or sets the job count of the runbook.
     * 
     */
    public Output</* @Nullable */ Integer> getJobCount() {
        return this.jobCount;
    }
    /**
     * Gets or sets the last modified by.
     * 
     */
    @Export(name="lastModifiedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedBy;

    /**
     * @return Gets or sets the last modified by.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The Azure Region where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Gets or sets the option to log activity trace of the runbook.
     * 
     */
    @Export(name="logActivityTrace", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> logActivityTrace;

    /**
     * @return Gets or sets the option to log activity trace of the runbook.
     * 
     */
    public Output</* @Nullable */ Integer> getLogActivityTrace() {
        return this.logActivityTrace;
    }
    /**
     * Gets or sets progress log option.
     * 
     */
    @Export(name="logProgress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> logProgress;

    /**
     * @return Gets or sets progress log option.
     * 
     */
    public Output</* @Nullable */ Boolean> getLogProgress() {
        return this.logProgress;
    }
    /**
     * Gets or sets verbose log option.
     * 
     */
    @Export(name="logVerbose", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> logVerbose;

    /**
     * @return Gets or sets verbose log option.
     * 
     */
    public Output</* @Nullable */ Boolean> getLogVerbose() {
        return this.logVerbose;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets or sets the runbook output types.
     * 
     */
    @Export(name="outputTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> outputTypes;

    /**
     * @return Gets or sets the runbook output types.
     * 
     */
    public Output</* @Nullable */ List<String>> getOutputTypes() {
        return this.outputTypes;
    }
    /**
     * Gets or sets the runbook parameters.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, RunbookParameterResponse.class})
    private Output</* @Nullable */ Map<String,RunbookParameterResponse>> parameters;

    /**
     * @return Gets or sets the runbook parameters.
     * 
     */
    public Output</* @Nullable */ Map<String,RunbookParameterResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * Gets or sets the provisioning state of the runbook.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Gets or sets the provisioning state of the runbook.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the published runbook content link.
     * 
     */
    @Export(name="publishContentLink", type=ContentLinkResponse.class, parameters={})
    private Output</* @Nullable */ ContentLinkResponse> publishContentLink;

    /**
     * @return Gets or sets the published runbook content link.
     * 
     */
    public Output</* @Nullable */ ContentLinkResponse> getPublishContentLink() {
        return this.publishContentLink;
    }
    /**
     * Gets or sets the type of the runbook.
     * 
     */
    @Export(name="runbookType", type=String.class, parameters={})
    private Output</* @Nullable */ String> runbookType;

    /**
     * @return Gets or sets the type of the runbook.
     * 
     */
    public Output</* @Nullable */ String> getRunbookType() {
        return this.runbookType;
    }
    /**
     * Gets or sets the state of the runbook.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return Gets or sets the state of the runbook.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Runbook(String name) {
        this(name, RunbookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Runbook(String name, RunbookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Runbook(String name, RunbookArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Runbook", name, args == null ? RunbookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Runbook(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Runbook", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20151031:Runbook").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20180630:Runbook").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20190601:Runbook").build())
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
    public static Runbook get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Runbook(name, id, options);
    }
}
