// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.domains_v1.outputs.ContactSettingsResponse;
import io.pulumi.googlenative.domains_v1.outputs.DnsSettingsResponse;
import io.pulumi.googlenative.domains_v1.outputs.ManagementSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRegistrationResult {
    /**
     * Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureContactSettings` method.
     * 
     */
    private final ContactSettingsResponse contactSettings;
    /**
     * The creation timestamp of the `Registration` resource.
     * 
     */
    private final String createTime;
    /**
     * Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureDnsSettings` method.
     * 
     */
    private final DnsSettingsResponse dnsSettings;
    /**
     * Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
     * 
     */
    private final String domainName;
    /**
     * The expiration timestamp of the `Registration`.
     * 
     */
    private final String expireTime;
    /**
     * The set of issues with the `Registration` that require attention.
     * 
     */
    private final List<String> issues;
    /**
     * Set of labels associated with the `Registration`.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureManagementSettings` method.
     * 
     */
    private final ManagementSettingsResponse managementSettings;
    /**
     * Name of the `Registration` resource, in the format `projects/*{@literal /}locations/*{@literal /}registrations/`.
     * 
     */
    private final String name;
    /**
     * Pending contact settings for the `Registration`. Updates to the `contact_settings` field that change its `registrant_contact` or `privacy` fields require email confirmation by the `registrant_contact` before taking effect. This field is set only if there are pending updates to the `contact_settings` that have not been confirmed. To confirm the changes, the `registrant_contact` must follow the instructions in the email they receive.
     * 
     */
    private final ContactSettingsResponse pendingContactSettings;
    /**
     * The state of the `Registration`
     * 
     */
    private final String state;
    /**
     * Set of options for the `contact_settings.privacy` field that this `Registration` supports.
     * 
     */
    private final List<String> supportedPrivacy;

    @OutputCustomType.Constructor({"contactSettings","createTime","dnsSettings","domainName","expireTime","issues","labels","managementSettings","name","pendingContactSettings","state","supportedPrivacy"})
    private GetRegistrationResult(
        ContactSettingsResponse contactSettings,
        String createTime,
        DnsSettingsResponse dnsSettings,
        String domainName,
        String expireTime,
        List<String> issues,
        Map<String,String> labels,
        ManagementSettingsResponse managementSettings,
        String name,
        ContactSettingsResponse pendingContactSettings,
        String state,
        List<String> supportedPrivacy) {
        this.contactSettings = Objects.requireNonNull(contactSettings);
        this.createTime = Objects.requireNonNull(createTime);
        this.dnsSettings = Objects.requireNonNull(dnsSettings);
        this.domainName = Objects.requireNonNull(domainName);
        this.expireTime = Objects.requireNonNull(expireTime);
        this.issues = Objects.requireNonNull(issues);
        this.labels = Objects.requireNonNull(labels);
        this.managementSettings = Objects.requireNonNull(managementSettings);
        this.name = Objects.requireNonNull(name);
        this.pendingContactSettings = Objects.requireNonNull(pendingContactSettings);
        this.state = Objects.requireNonNull(state);
        this.supportedPrivacy = Objects.requireNonNull(supportedPrivacy);
    }

    /**
     * Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureContactSettings` method.
     * 
     */
    public ContactSettingsResponse getContactSettings() {
        return this.contactSettings;
    }
    /**
     * The creation timestamp of the `Registration` resource.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureDnsSettings` method.
     * 
     */
    public DnsSettingsResponse getDnsSettings() {
        return this.dnsSettings;
    }
    /**
     * Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
     * 
     */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The expiration timestamp of the `Registration`.
     * 
     */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * The set of issues with the `Registration` that require attention.
     * 
     */
    public List<String> getIssues() {
        return this.issues;
    }
    /**
     * Set of labels associated with the `Registration`.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureManagementSettings` method.
     * 
     */
    public ManagementSettingsResponse getManagementSettings() {
        return this.managementSettings;
    }
    /**
     * Name of the `Registration` resource, in the format `projects/*{@literal /}locations/*{@literal /}registrations/`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Pending contact settings for the `Registration`. Updates to the `contact_settings` field that change its `registrant_contact` or `privacy` fields require email confirmation by the `registrant_contact` before taking effect. This field is set only if there are pending updates to the `contact_settings` that have not been confirmed. To confirm the changes, the `registrant_contact` must follow the instructions in the email they receive.
     * 
     */
    public ContactSettingsResponse getPendingContactSettings() {
        return this.pendingContactSettings;
    }
    /**
     * The state of the `Registration`
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Set of options for the `contact_settings.privacy` field that this `Registration` supports.
     * 
     */
    public List<String> getSupportedPrivacy() {
        return this.supportedPrivacy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactSettingsResponse contactSettings;
        private String createTime;
        private DnsSettingsResponse dnsSettings;
        private String domainName;
        private String expireTime;
        private List<String> issues;
        private Map<String,String> labels;
        private ManagementSettingsResponse managementSettings;
        private String name;
        private ContactSettingsResponse pendingContactSettings;
        private String state;
        private List<String> supportedPrivacy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactSettings = defaults.contactSettings;
    	      this.createTime = defaults.createTime;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.domainName = defaults.domainName;
    	      this.expireTime = defaults.expireTime;
    	      this.issues = defaults.issues;
    	      this.labels = defaults.labels;
    	      this.managementSettings = defaults.managementSettings;
    	      this.name = defaults.name;
    	      this.pendingContactSettings = defaults.pendingContactSettings;
    	      this.state = defaults.state;
    	      this.supportedPrivacy = defaults.supportedPrivacy;
        }

        public Builder setContactSettings(ContactSettingsResponse contactSettings) {
            this.contactSettings = Objects.requireNonNull(contactSettings);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDnsSettings(DnsSettingsResponse dnsSettings) {
            this.dnsSettings = Objects.requireNonNull(dnsSettings);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setIssues(List<String> issues) {
            this.issues = Objects.requireNonNull(issues);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setManagementSettings(ManagementSettingsResponse managementSettings) {
            this.managementSettings = Objects.requireNonNull(managementSettings);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPendingContactSettings(ContactSettingsResponse pendingContactSettings) {
            this.pendingContactSettings = Objects.requireNonNull(pendingContactSettings);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSupportedPrivacy(List<String> supportedPrivacy) {
            this.supportedPrivacy = Objects.requireNonNull(supportedPrivacy);
            return this;
        }

        public GetRegistrationResult build() {
            return new GetRegistrationResult(contactSettings, createTime, dnsSettings, domainName, expireTime, issues, labels, managementSettings, name, pendingContactSettings, state, supportedPrivacy);
        }
    }
}
