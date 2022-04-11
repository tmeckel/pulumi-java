// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.AccountAuditConfigurationArgs;
import io.pulumi.awsnative.iot.outputs.AccountAuditConfigurationAuditCheckConfigurations;
import io.pulumi.awsnative.iot.outputs.AccountAuditConfigurationAuditNotificationTargetConfigurations;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Configures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
 * 
 */
@ResourceType(type="aws-native:iot:AccountAuditConfiguration")
public class AccountAuditConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Your 12-digit account ID (used as the primary identifier for the CloudFormation resource).
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return Your 12-digit account ID (used as the primary identifier for the CloudFormation resource).
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    @Export(name="auditCheckConfigurations", type=AccountAuditConfigurationAuditCheckConfigurations.class, parameters={})
    private Output<AccountAuditConfigurationAuditCheckConfigurations> auditCheckConfigurations;

    public Output<AccountAuditConfigurationAuditCheckConfigurations> getAuditCheckConfigurations() {
        return this.auditCheckConfigurations;
    }
    @Export(name="auditNotificationTargetConfigurations", type=AccountAuditConfigurationAuditNotificationTargetConfigurations.class, parameters={})
    private Output</* @Nullable */ AccountAuditConfigurationAuditNotificationTargetConfigurations> auditNotificationTargetConfigurations;

    public Output</* @Nullable */ AccountAuditConfigurationAuditNotificationTargetConfigurations> getAuditNotificationTargetConfigurations() {
        return this.auditNotificationTargetConfigurations;
    }
    /**
     * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as required when performing an audit.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as required when performing an audit.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountAuditConfiguration(String name) {
        this(name, AccountAuditConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountAuditConfiguration(String name, AccountAuditConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountAuditConfiguration(String name, AccountAuditConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:AccountAuditConfiguration", name, args == null ? AccountAuditConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccountAuditConfiguration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:AccountAuditConfiguration", name, null, makeResourceOptions(options, id));
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
    public static AccountAuditConfiguration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccountAuditConfiguration(name, id, options);
    }
}
