// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.logging_v2.BillingAccountExclusionArgs;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new exclusion in the _Default sink in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions in a resource.
 * 
 */
@ResourceType(type="google-native:logging/v2:BillingAccountExclusion")
public class BillingAccountExclusion extends io.pulumi.resources.CustomResource {
    /**
     * The creation timestamp of the exclusion.This field may not be present for older exclusions.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of the exclusion.This field may not be present for older exclusions.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. A description of this exclusion.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A description of this exclusion.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can update an exclusion to change the value of this field.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can update an exclusion to change the value of this field.
     * 
     */
    public Output<Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries) that matches the log entries to be excluded. By using the sample function (https://cloud.google.com/logging/docs/view/advanced-queries#sample), you can exclude less than 100% of the matching log entries.For example, the following query matches 99% of low-severity log entries from Google Cloud Storage buckets:resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries) that matches the log entries to be excluded. By using the sample function (https://cloud.google.com/logging/docs/view/advanced-queries#sample), you can exclude less than 100% of the matching log entries.For example, the following query matches 99% of low-severity log entries from Google Cloud Storage buckets:resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)
     * 
     */
    public Output<String> getFilter() {
        return this.filter;
    }
    /**
     * A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The last update timestamp of the exclusion.This field may not be present for older exclusions.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of the exclusion.This field may not be present for older exclusions.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BillingAccountExclusion(String name) {
        this(name, BillingAccountExclusionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BillingAccountExclusion(String name, BillingAccountExclusionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingAccountExclusion(String name, BillingAccountExclusionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:logging/v2:BillingAccountExclusion", name, args == null ? BillingAccountExclusionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BillingAccountExclusion(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:logging/v2:BillingAccountExclusion", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BillingAccountExclusion get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BillingAccountExclusion(name, id, options);
    }
}
