// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.domains_v1.RegistrationArgs;
import io.pulumi.googlenative.domains_v1.outputs.ContactSettingsResponse;
import io.pulumi.googlenative.domains_v1.outputs.DnsSettingsResponse;
import io.pulumi.googlenative.domains_v1.outputs.ManagementSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Registers a new domain name and creates a corresponding `Registration` resource. Call `RetrieveRegisterParameters` first to check availability of the domain name and determine parameters like price that are needed to build a call to this method. A successful call creates a `Registration` resource in state `REGISTRATION_PENDING`, which resolves to `ACTIVE` within 1-2 minutes, indicating that the domain was successfully registered. If the resource ends up in state `REGISTRATION_FAILED`, it indicates that the domain was not registered successfully, and you can safely delete the resource and retry registration.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:domains/v1:Registration")
public class Registration extends io.pulumi.resources.CustomResource {
    /**
     * Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureContactSettings` method.
     * 
     */
    @Export(name="contactSettings", type=ContactSettingsResponse.class, parameters={})
    private Output<ContactSettingsResponse> contactSettings;

    /**
     * @return Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureContactSettings` method.
     * 
     */
    public Output<ContactSettingsResponse> getContactSettings() {
        return this.contactSettings;
    }
    /**
     * The creation timestamp of the `Registration` resource.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of the `Registration` resource.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureDnsSettings` method.
     * 
     */
    @Export(name="dnsSettings", type=DnsSettingsResponse.class, parameters={})
    private Output<DnsSettingsResponse> dnsSettings;

    /**
     * @return Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureDnsSettings` method.
     * 
     */
    public Output<DnsSettingsResponse> getDnsSettings() {
        return this.dnsSettings;
    }
    /**
     * Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The expiration timestamp of the `Registration`.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The expiration timestamp of the `Registration`.
     * 
     */
    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    /**
     * The set of issues with the `Registration` that require attention.
     * 
     */
    @Export(name="issues", type=List.class, parameters={String.class})
    private Output<List<String>> issues;

    /**
     * @return The set of issues with the `Registration` that require attention.
     * 
     */
    public Output<List<String>> getIssues() {
        return this.issues;
    }
    /**
     * Set of labels associated with the `Registration`.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Set of labels associated with the `Registration`.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureManagementSettings` method.
     * 
     */
    @Export(name="managementSettings", type=ManagementSettingsResponse.class, parameters={})
    private Output<ManagementSettingsResponse> managementSettings;

    /**
     * @return Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureManagementSettings` method.
     * 
     */
    public Output<ManagementSettingsResponse> getManagementSettings() {
        return this.managementSettings;
    }
    /**
     * Name of the `Registration` resource, in the format `projects/*{@literal /}locations/*{@literal /}registrations/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the `Registration` resource, in the format `projects/*{@literal /}locations/*{@literal /}registrations/`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Pending contact settings for the `Registration`. Updates to the `contact_settings` field that change its `registrant_contact` or `privacy` fields require email confirmation by the `registrant_contact` before taking effect. This field is set only if there are pending updates to the `contact_settings` that have not been confirmed. To confirm the changes, the `registrant_contact` must follow the instructions in the email they receive.
     * 
     */
    @Export(name="pendingContactSettings", type=ContactSettingsResponse.class, parameters={})
    private Output<ContactSettingsResponse> pendingContactSettings;

    /**
     * @return Pending contact settings for the `Registration`. Updates to the `contact_settings` field that change its `registrant_contact` or `privacy` fields require email confirmation by the `registrant_contact` before taking effect. This field is set only if there are pending updates to the `contact_settings` that have not been confirmed. To confirm the changes, the `registrant_contact` must follow the instructions in the email they receive.
     * 
     */
    public Output<ContactSettingsResponse> getPendingContactSettings() {
        return this.pendingContactSettings;
    }
    /**
     * The state of the `Registration`
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the `Registration`
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Set of options for the `contact_settings.privacy` field that this `Registration` supports.
     * 
     */
    @Export(name="supportedPrivacy", type=List.class, parameters={String.class})
    private Output<List<String>> supportedPrivacy;

    /**
     * @return Set of options for the `contact_settings.privacy` field that this `Registration` supports.
     * 
     */
    public Output<List<String>> getSupportedPrivacy() {
        return this.supportedPrivacy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Registration(String name) {
        this(name, RegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Registration(String name, RegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Registration(String name, RegistrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:domains/v1:Registration", name, args == null ? RegistrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Registration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:domains/v1:Registration", name, null, makeResourceOptions(options, id));
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
    public static Registration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Registration(name, id, options);
    }
}
