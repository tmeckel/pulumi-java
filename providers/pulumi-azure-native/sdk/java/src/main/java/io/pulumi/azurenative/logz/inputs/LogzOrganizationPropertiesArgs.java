// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogzOrganizationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogzOrganizationPropertiesArgs Empty = new LogzOrganizationPropertiesArgs();

    /**
     * Name of the Logz organization.
     * 
     */
    @InputImport(name="companyName")
      private final @Nullable Input<String> companyName;

    public Input<String> getCompanyName() {
        return this.companyName == null ? Input.empty() : this.companyName;
    }

    /**
     * The Id of the Enterprise App used for Single sign on.
     * 
     */
    @InputImport(name="enterpriseAppId")
      private final @Nullable Input<String> enterpriseAppId;

    public Input<String> getEnterpriseAppId() {
        return this.enterpriseAppId == null ? Input.empty() : this.enterpriseAppId;
    }

    /**
     * The login URL specific to this Logz Organization.
     * 
     */
    @InputImport(name="singleSignOnUrl")
      private final @Nullable Input<String> singleSignOnUrl;

    public Input<String> getSingleSignOnUrl() {
        return this.singleSignOnUrl == null ? Input.empty() : this.singleSignOnUrl;
    }

    public LogzOrganizationPropertiesArgs(
        @Nullable Input<String> companyName,
        @Nullable Input<String> enterpriseAppId,
        @Nullable Input<String> singleSignOnUrl) {
        this.companyName = companyName;
        this.enterpriseAppId = enterpriseAppId;
        this.singleSignOnUrl = singleSignOnUrl;
    }

    private LogzOrganizationPropertiesArgs() {
        this.companyName = Input.empty();
        this.enterpriseAppId = Input.empty();
        this.singleSignOnUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogzOrganizationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> companyName;
        private @Nullable Input<String> enterpriseAppId;
        private @Nullable Input<String> singleSignOnUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(LogzOrganizationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.companyName = defaults.companyName;
    	      this.enterpriseAppId = defaults.enterpriseAppId;
    	      this.singleSignOnUrl = defaults.singleSignOnUrl;
        }

        public Builder companyName(@Nullable Input<String> companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder companyName(@Nullable String companyName) {
            this.companyName = Input.ofNullable(companyName);
            return this;
        }

        public Builder enterpriseAppId(@Nullable Input<String> enterpriseAppId) {
            this.enterpriseAppId = enterpriseAppId;
            return this;
        }

        public Builder enterpriseAppId(@Nullable String enterpriseAppId) {
            this.enterpriseAppId = Input.ofNullable(enterpriseAppId);
            return this;
        }

        public Builder singleSignOnUrl(@Nullable Input<String> singleSignOnUrl) {
            this.singleSignOnUrl = singleSignOnUrl;
            return this;
        }

        public Builder singleSignOnUrl(@Nullable String singleSignOnUrl) {
            this.singleSignOnUrl = Input.ofNullable(singleSignOnUrl);
            return this;
        }
        public LogzOrganizationPropertiesArgs build() {
            return new LogzOrganizationPropertiesArgs(companyName, enterpriseAppId, singleSignOnUrl);
        }
    }
}
