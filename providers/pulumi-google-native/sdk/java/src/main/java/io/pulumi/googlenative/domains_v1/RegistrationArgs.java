// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.domains_v1.enums.RegistrationContactNoticesItem;
import io.pulumi.googlenative.domains_v1.enums.RegistrationDomainNoticesItem;
import io.pulumi.googlenative.domains_v1.inputs.ContactSettingsArgs;
import io.pulumi.googlenative.domains_v1.inputs.DnsSettingsArgs;
import io.pulumi.googlenative.domains_v1.inputs.ManagementSettingsArgs;
import io.pulumi.googlenative.domains_v1.inputs.MoneyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistrationArgs Empty = new RegistrationArgs();

    /**
     * The list of contact notices that the caller acknowledges. The notices needed here depend on the values specified in `registration.contact_settings`.
     * 
     */
    @InputImport(name="contactNotices")
      private final @Nullable Input<List<RegistrationContactNoticesItem>> contactNotices;

    public Input<List<RegistrationContactNoticesItem>> getContactNotices() {
        return this.contactNotices == null ? Input.empty() : this.contactNotices;
    }

    /**
     * Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureContactSettings` method.
     * 
     */
    @InputImport(name="contactSettings", required=true)
      private final Input<ContactSettingsArgs> contactSettings;

    public Input<ContactSettingsArgs> getContactSettings() {
        return this.contactSettings;
    }

    /**
     * Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureDnsSettings` method.
     * 
     */
    @InputImport(name="dnsSettings")
      private final @Nullable Input<DnsSettingsArgs> dnsSettings;

    public Input<DnsSettingsArgs> getDnsSettings() {
        return this.dnsSettings == null ? Input.empty() : this.dnsSettings;
    }

    /**
     * Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The list of domain notices that you acknowledge. Call `RetrieveRegisterParameters` to see the notices that need acknowledgement.
     * 
     */
    @InputImport(name="domainNotices")
      private final @Nullable Input<List<RegistrationDomainNoticesItem>> domainNotices;

    public Input<List<RegistrationDomainNoticesItem>> getDomainNotices() {
        return this.domainNotices == null ? Input.empty() : this.domainNotices;
    }

    /**
     * Set of labels associated with the `Registration`.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureManagementSettings` method.
     * 
     */
    @InputImport(name="managementSettings")
      private final @Nullable Input<ManagementSettingsArgs> managementSettings;

    public Input<ManagementSettingsArgs> getManagementSettings() {
        return this.managementSettings == null ? Input.empty() : this.managementSettings;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * When true, only validation is performed, without actually registering the domain. Follows: https://cloud.google.com/apis/design/design_patterns#request_validation
     * 
     */
    @InputImport(name="validateOnly")
      private final @Nullable Input<Boolean> validateOnly;

    public Input<Boolean> getValidateOnly() {
        return this.validateOnly == null ? Input.empty() : this.validateOnly;
    }

    /**
     * Yearly price to register or renew the domain. The value that should be put here can be obtained from RetrieveRegisterParameters or SearchDomains calls.
     * 
     */
    @InputImport(name="yearlyPrice", required=true)
      private final Input<MoneyArgs> yearlyPrice;

    public Input<MoneyArgs> getYearlyPrice() {
        return this.yearlyPrice;
    }

    public RegistrationArgs(
        @Nullable Input<List<RegistrationContactNoticesItem>> contactNotices,
        Input<ContactSettingsArgs> contactSettings,
        @Nullable Input<DnsSettingsArgs> dnsSettings,
        Input<String> domainName,
        @Nullable Input<List<RegistrationDomainNoticesItem>> domainNotices,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<ManagementSettingsArgs> managementSettings,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> validateOnly,
        Input<MoneyArgs> yearlyPrice) {
        this.contactNotices = contactNotices;
        this.contactSettings = Objects.requireNonNull(contactSettings, "expected parameter 'contactSettings' to be non-null");
        this.dnsSettings = dnsSettings;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainNotices = domainNotices;
        this.labels = labels;
        this.location = location;
        this.managementSettings = managementSettings;
        this.project = project;
        this.validateOnly = validateOnly;
        this.yearlyPrice = Objects.requireNonNull(yearlyPrice, "expected parameter 'yearlyPrice' to be non-null");
    }

    private RegistrationArgs() {
        this.contactNotices = Input.empty();
        this.contactSettings = Input.empty();
        this.dnsSettings = Input.empty();
        this.domainName = Input.empty();
        this.domainNotices = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.managementSettings = Input.empty();
        this.project = Input.empty();
        this.validateOnly = Input.empty();
        this.yearlyPrice = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RegistrationContactNoticesItem>> contactNotices;
        private Input<ContactSettingsArgs> contactSettings;
        private @Nullable Input<DnsSettingsArgs> dnsSettings;
        private Input<String> domainName;
        private @Nullable Input<List<RegistrationDomainNoticesItem>> domainNotices;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<ManagementSettingsArgs> managementSettings;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> validateOnly;
        private Input<MoneyArgs> yearlyPrice;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactNotices = defaults.contactNotices;
    	      this.contactSettings = defaults.contactSettings;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.domainName = defaults.domainName;
    	      this.domainNotices = defaults.domainNotices;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.managementSettings = defaults.managementSettings;
    	      this.project = defaults.project;
    	      this.validateOnly = defaults.validateOnly;
    	      this.yearlyPrice = defaults.yearlyPrice;
        }

        public Builder contactNotices(@Nullable Input<List<RegistrationContactNoticesItem>> contactNotices) {
            this.contactNotices = contactNotices;
            return this;
        }

        public Builder contactNotices(@Nullable List<RegistrationContactNoticesItem> contactNotices) {
            this.contactNotices = Input.ofNullable(contactNotices);
            return this;
        }

        public Builder contactSettings(Input<ContactSettingsArgs> contactSettings) {
            this.contactSettings = Objects.requireNonNull(contactSettings);
            return this;
        }

        public Builder contactSettings(ContactSettingsArgs contactSettings) {
            this.contactSettings = Input.of(Objects.requireNonNull(contactSettings));
            return this;
        }

        public Builder dnsSettings(@Nullable Input<DnsSettingsArgs> dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder dnsSettings(@Nullable DnsSettingsArgs dnsSettings) {
            this.dnsSettings = Input.ofNullable(dnsSettings);
            return this;
        }

        public Builder domainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder domainNotices(@Nullable Input<List<RegistrationDomainNoticesItem>> domainNotices) {
            this.domainNotices = domainNotices;
            return this;
        }

        public Builder domainNotices(@Nullable List<RegistrationDomainNoticesItem> domainNotices) {
            this.domainNotices = Input.ofNullable(domainNotices);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder managementSettings(@Nullable Input<ManagementSettingsArgs> managementSettings) {
            this.managementSettings = managementSettings;
            return this;
        }

        public Builder managementSettings(@Nullable ManagementSettingsArgs managementSettings) {
            this.managementSettings = Input.ofNullable(managementSettings);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder validateOnly(@Nullable Input<Boolean> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder validateOnly(@Nullable Boolean validateOnly) {
            this.validateOnly = Input.ofNullable(validateOnly);
            return this;
        }

        public Builder yearlyPrice(Input<MoneyArgs> yearlyPrice) {
            this.yearlyPrice = Objects.requireNonNull(yearlyPrice);
            return this;
        }

        public Builder yearlyPrice(MoneyArgs yearlyPrice) {
            this.yearlyPrice = Input.of(Objects.requireNonNull(yearlyPrice));
            return this;
        }
        public RegistrationArgs build() {
            return new RegistrationArgs(contactNotices, contactSettings, dnsSettings, domainName, domainNotices, labels, location, managementSettings, project, validateOnly, yearlyPrice);
        }
    }
}
