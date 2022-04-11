// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssm.PatchBaselineArgs;
import io.pulumi.aws.ssm.inputs.PatchBaselineState;
import io.pulumi.aws.ssm.outputs.PatchBaselineApprovalRule;
import io.pulumi.aws.ssm.outputs.PatchBaselineGlobalFilter;
import io.pulumi.aws.ssm.outputs.PatchBaselineSource;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an SSM Patch Baseline resource
 * 
 * > **NOTE on Patch Baselines:** The `approved_patches` and `approval_rule` are
 * both marked as optional fields, but the Patch Baseline requires that at least one
 * of them is specified.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SSM Patch Baselines can be imported by their baseline ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssm/patchBaseline:PatchBaseline example pb-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ssm/patchBaseline:PatchBaseline")
public class PatchBaseline extends io.pulumi.resources.CustomResource {
    /**
     * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approval_rule block requires the fields documented below.
     * 
     */
    @Export(name="approvalRules", type=List.class, parameters={PatchBaselineApprovalRule.class})
    private Output</* @Nullable */ List<PatchBaselineApprovalRule>> approvalRules;

    /**
     * @return A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approval_rule block requires the fields documented below.
     * 
     */
    public Output</* @Nullable */ List<PatchBaselineApprovalRule>> getApprovalRules() {
        return this.approvalRules;
    }
    /**
     * A list of explicitly approved patches for the baseline.
     * 
     */
    @Export(name="approvedPatches", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> approvedPatches;

    /**
     * @return A list of explicitly approved patches for the baseline.
     * 
     */
    public Output</* @Nullable */ List<String>> getApprovedPatches() {
        return this.approvedPatches;
    }
    /**
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    @Export(name="approvedPatchesComplianceLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> approvedPatchesComplianceLevel;

    /**
     * @return Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    public Output</* @Nullable */ String> getApprovedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel;
    }
    /**
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. Applies to Linux instances only.
     * 
     */
    @Export(name="approvedPatchesEnableNonSecurity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> approvedPatchesEnableNonSecurity;

    /**
     * @return Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. Applies to Linux instances only.
     * 
     */
    public Output</* @Nullable */ Boolean> getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }
    /**
     * The ARN of the patch baseline.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the patch baseline.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the patch baseline.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the patch baseline.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
     * 
     */
    @Export(name="globalFilters", type=List.class, parameters={PatchBaselineGlobalFilter.class})
    private Output</* @Nullable */ List<PatchBaselineGlobalFilter>> globalFilters;

    /**
     * @return A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
     * 
     */
    public Output</* @Nullable */ List<PatchBaselineGlobalFilter>> getGlobalFilters() {
        return this.globalFilters;
    }
    /**
     * The name specified to identify the patch source.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name specified to identify the patch source.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
     * 
     */
    @Export(name="operatingSystem", type=String.class, parameters={})
    private Output</* @Nullable */ String> operatingSystem;

    /**
     * @return Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
     * 
     */
    public Output</* @Nullable */ String> getOperatingSystem() {
        return this.operatingSystem;
    }
    /**
     * A list of rejected patches.
     * 
     */
    @Export(name="rejectedPatches", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> rejectedPatches;

    /**
     * @return A list of rejected patches.
     * 
     */
    public Output</* @Nullable */ List<String>> getRejectedPatches() {
        return this.rejectedPatches;
    }
    /**
     * The action for Patch Manager to take on patches included in the `rejected_patches` list. Allow values are `ALLOW_AS_DEPENDENCY` and `BLOCK`.
     * 
     */
    @Export(name="rejectedPatchesAction", type=String.class, parameters={})
    private Output<String> rejectedPatchesAction;

    /**
     * @return The action for Patch Manager to take on patches included in the `rejected_patches` list. Allow values are `ALLOW_AS_DEPENDENCY` and `BLOCK`.
     * 
     */
    public Output<String> getRejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }
    /**
     * Configuration block(s) with alternate sources for patches. Applies to Linux instances only. Documented below.
     * 
     */
    @Export(name="sources", type=List.class, parameters={PatchBaselineSource.class})
    private Output</* @Nullable */ List<PatchBaselineSource>> sources;

    /**
     * @return Configuration block(s) with alternate sources for patches. Applies to Linux instances only. Documented below.
     * 
     */
    public Output</* @Nullable */ List<PatchBaselineSource>> getSources() {
        return this.sources;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PatchBaseline(String name) {
        this(name, PatchBaselineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PatchBaseline(String name, @Nullable PatchBaselineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PatchBaseline(String name, @Nullable PatchBaselineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/patchBaseline:PatchBaseline", name, args == null ? PatchBaselineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PatchBaseline(String name, Output<String> id, @Nullable PatchBaselineState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/patchBaseline:PatchBaseline", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PatchBaseline get(String name, Output<String> id, @Nullable PatchBaselineState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PatchBaseline(name, id, state, options);
    }
}
