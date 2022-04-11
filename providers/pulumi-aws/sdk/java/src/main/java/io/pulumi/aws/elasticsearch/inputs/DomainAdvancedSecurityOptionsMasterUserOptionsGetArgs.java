// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs Empty = new DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs();

    /**
     * ARN for the main user. Only specify if `internal_user_database_enabled` is not set or set to `false`.
     * 
     */
    @Import(name="masterUserArn")
      private final @Nullable Output<String> masterUserArn;

    public Output<String> getMasterUserArn() {
        return this.masterUserArn == null ? Codegen.empty() : this.masterUserArn;
    }

    /**
     * Main user's username, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internal_user_database_enabled` is set to `true`.
     * 
     */
    @Import(name="masterUserName")
      private final @Nullable Output<String> masterUserName;

    public Output<String> getMasterUserName() {
        return this.masterUserName == null ? Codegen.empty() : this.masterUserName;
    }

    /**
     * Main user's password, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internal_user_database_enabled` is set to `true`.
     * 
     */
    @Import(name="masterUserPassword")
      private final @Nullable Output<String> masterUserPassword;

    public Output<String> getMasterUserPassword() {
        return this.masterUserPassword == null ? Codegen.empty() : this.masterUserPassword;
    }

    public DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs(
        @Nullable Output<String> masterUserArn,
        @Nullable Output<String> masterUserName,
        @Nullable Output<String> masterUserPassword) {
        this.masterUserArn = masterUserArn;
        this.masterUserName = masterUserName;
        this.masterUserPassword = masterUserPassword;
    }

    private DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs() {
        this.masterUserArn = Codegen.empty();
        this.masterUserName = Codegen.empty();
        this.masterUserPassword = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> masterUserArn;
        private @Nullable Output<String> masterUserName;
        private @Nullable Output<String> masterUserPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterUserArn = defaults.masterUserArn;
    	      this.masterUserName = defaults.masterUserName;
    	      this.masterUserPassword = defaults.masterUserPassword;
        }

        public Builder masterUserArn(@Nullable Output<String> masterUserArn) {
            this.masterUserArn = masterUserArn;
            return this;
        }
        public Builder masterUserArn(@Nullable String masterUserArn) {
            this.masterUserArn = Codegen.ofNullable(masterUserArn);
            return this;
        }
        public Builder masterUserName(@Nullable Output<String> masterUserName) {
            this.masterUserName = masterUserName;
            return this;
        }
        public Builder masterUserName(@Nullable String masterUserName) {
            this.masterUserName = Codegen.ofNullable(masterUserName);
            return this;
        }
        public Builder masterUserPassword(@Nullable Output<String> masterUserPassword) {
            this.masterUserPassword = masterUserPassword;
            return this;
        }
        public Builder masterUserPassword(@Nullable String masterUserPassword) {
            this.masterUserPassword = Codegen.ofNullable(masterUserPassword);
            return this;
        }        public DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs build() {
            return new DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs(masterUserArn, masterUserName, masterUserPassword);
        }
    }
}
