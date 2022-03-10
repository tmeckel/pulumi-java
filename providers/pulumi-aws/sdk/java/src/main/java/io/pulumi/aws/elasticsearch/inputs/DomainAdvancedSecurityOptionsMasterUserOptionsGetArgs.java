// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs Empty = new DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs();

    /**
     * ARN for the main user. Only specify if `internal_user_database_enabled` is not set or set to `false`.
     * 
     */
    @InputImport(name="masterUserArn")
      private final @Nullable Input<String> masterUserArn;

    public Input<String> getMasterUserArn() {
        return this.masterUserArn == null ? Input.empty() : this.masterUserArn;
    }

    /**
     * Main user's username, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internal_user_database_enabled` is set to `true`.
     * 
     */
    @InputImport(name="masterUserName")
      private final @Nullable Input<String> masterUserName;

    public Input<String> getMasterUserName() {
        return this.masterUserName == null ? Input.empty() : this.masterUserName;
    }

    /**
     * Main user's password, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internal_user_database_enabled` is set to `true`.
     * 
     */
    @InputImport(name="masterUserPassword")
      private final @Nullable Input<String> masterUserPassword;

    public Input<String> getMasterUserPassword() {
        return this.masterUserPassword == null ? Input.empty() : this.masterUserPassword;
    }

    public DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs(
        @Nullable Input<String> masterUserArn,
        @Nullable Input<String> masterUserName,
        @Nullable Input<String> masterUserPassword) {
        this.masterUserArn = masterUserArn;
        this.masterUserName = masterUserName;
        this.masterUserPassword = masterUserPassword;
    }

    private DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs() {
        this.masterUserArn = Input.empty();
        this.masterUserName = Input.empty();
        this.masterUserPassword = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> masterUserArn;
        private @Nullable Input<String> masterUserName;
        private @Nullable Input<String> masterUserPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterUserArn = defaults.masterUserArn;
    	      this.masterUserName = defaults.masterUserName;
    	      this.masterUserPassword = defaults.masterUserPassword;
        }

        public Builder masterUserArn(@Nullable Input<String> masterUserArn) {
            this.masterUserArn = masterUserArn;
            return this;
        }

        public Builder masterUserArn(@Nullable String masterUserArn) {
            this.masterUserArn = Input.ofNullable(masterUserArn);
            return this;
        }

        public Builder masterUserName(@Nullable Input<String> masterUserName) {
            this.masterUserName = masterUserName;
            return this;
        }

        public Builder masterUserName(@Nullable String masterUserName) {
            this.masterUserName = Input.ofNullable(masterUserName);
            return this;
        }

        public Builder masterUserPassword(@Nullable Input<String> masterUserPassword) {
            this.masterUserPassword = masterUserPassword;
            return this;
        }

        public Builder masterUserPassword(@Nullable String masterUserPassword) {
            this.masterUserPassword = Input.ofNullable(masterUserPassword);
            return this;
        }
        public DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs build() {
            return new DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs(masterUserArn, masterUserName, masterUserPassword);
        }
    }
}
