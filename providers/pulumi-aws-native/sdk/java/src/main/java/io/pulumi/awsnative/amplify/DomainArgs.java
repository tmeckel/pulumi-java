// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify;

import io.pulumi.awsnative.amplify.inputs.DomainSubDomainSettingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    @Import(name="appId", required=true)
      private final Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }

    @Import(name="autoSubDomainCreationPatterns")
      private final @Nullable Output<List<String>> autoSubDomainCreationPatterns;

    public Output<List<String>> getAutoSubDomainCreationPatterns() {
        return this.autoSubDomainCreationPatterns == null ? Codegen.empty() : this.autoSubDomainCreationPatterns;
    }

    @Import(name="autoSubDomainIAMRole")
      private final @Nullable Output<String> autoSubDomainIAMRole;

    public Output<String> getAutoSubDomainIAMRole() {
        return this.autoSubDomainIAMRole == null ? Codegen.empty() : this.autoSubDomainIAMRole;
    }

    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    @Import(name="enableAutoSubDomain")
      private final @Nullable Output<Boolean> enableAutoSubDomain;

    public Output<Boolean> getEnableAutoSubDomain() {
        return this.enableAutoSubDomain == null ? Codegen.empty() : this.enableAutoSubDomain;
    }

    @Import(name="subDomainSettings", required=true)
      private final Output<List<DomainSubDomainSettingArgs>> subDomainSettings;

    public Output<List<DomainSubDomainSettingArgs>> getSubDomainSettings() {
        return this.subDomainSettings;
    }

    public DomainArgs(
        Output<String> appId,
        @Nullable Output<List<String>> autoSubDomainCreationPatterns,
        @Nullable Output<String> autoSubDomainIAMRole,
        @Nullable Output<String> domainName,
        @Nullable Output<Boolean> enableAutoSubDomain,
        Output<List<DomainSubDomainSettingArgs>> subDomainSettings) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.autoSubDomainCreationPatterns = autoSubDomainCreationPatterns;
        this.autoSubDomainIAMRole = autoSubDomainIAMRole;
        this.domainName = domainName;
        this.enableAutoSubDomain = enableAutoSubDomain;
        this.subDomainSettings = Objects.requireNonNull(subDomainSettings, "expected parameter 'subDomainSettings' to be non-null");
    }

    private DomainArgs() {
        this.appId = Codegen.empty();
        this.autoSubDomainCreationPatterns = Codegen.empty();
        this.autoSubDomainIAMRole = Codegen.empty();
        this.domainName = Codegen.empty();
        this.enableAutoSubDomain = Codegen.empty();
        this.subDomainSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appId;
        private @Nullable Output<List<String>> autoSubDomainCreationPatterns;
        private @Nullable Output<String> autoSubDomainIAMRole;
        private @Nullable Output<String> domainName;
        private @Nullable Output<Boolean> enableAutoSubDomain;
        private Output<List<DomainSubDomainSettingArgs>> subDomainSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.autoSubDomainCreationPatterns = defaults.autoSubDomainCreationPatterns;
    	      this.autoSubDomainIAMRole = defaults.autoSubDomainIAMRole;
    	      this.domainName = defaults.domainName;
    	      this.enableAutoSubDomain = defaults.enableAutoSubDomain;
    	      this.subDomainSettings = defaults.subDomainSettings;
        }

        public Builder appId(Output<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appId(String appId) {
            this.appId = Output.of(Objects.requireNonNull(appId));
            return this;
        }
        public Builder autoSubDomainCreationPatterns(@Nullable Output<List<String>> autoSubDomainCreationPatterns) {
            this.autoSubDomainCreationPatterns = autoSubDomainCreationPatterns;
            return this;
        }
        public Builder autoSubDomainCreationPatterns(@Nullable List<String> autoSubDomainCreationPatterns) {
            this.autoSubDomainCreationPatterns = Codegen.ofNullable(autoSubDomainCreationPatterns);
            return this;
        }
        public Builder autoSubDomainCreationPatterns(String... autoSubDomainCreationPatterns) {
            return autoSubDomainCreationPatterns(List.of(autoSubDomainCreationPatterns));
        }
        public Builder autoSubDomainIAMRole(@Nullable Output<String> autoSubDomainIAMRole) {
            this.autoSubDomainIAMRole = autoSubDomainIAMRole;
            return this;
        }
        public Builder autoSubDomainIAMRole(@Nullable String autoSubDomainIAMRole) {
            this.autoSubDomainIAMRole = Codegen.ofNullable(autoSubDomainIAMRole);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }
        public Builder enableAutoSubDomain(@Nullable Output<Boolean> enableAutoSubDomain) {
            this.enableAutoSubDomain = enableAutoSubDomain;
            return this;
        }
        public Builder enableAutoSubDomain(@Nullable Boolean enableAutoSubDomain) {
            this.enableAutoSubDomain = Codegen.ofNullable(enableAutoSubDomain);
            return this;
        }
        public Builder subDomainSettings(Output<List<DomainSubDomainSettingArgs>> subDomainSettings) {
            this.subDomainSettings = Objects.requireNonNull(subDomainSettings);
            return this;
        }
        public Builder subDomainSettings(List<DomainSubDomainSettingArgs> subDomainSettings) {
            this.subDomainSettings = Output.of(Objects.requireNonNull(subDomainSettings));
            return this;
        }
        public Builder subDomainSettings(DomainSubDomainSettingArgs... subDomainSettings) {
            return subDomainSettings(List.of(subDomainSettings));
        }        public DomainArgs build() {
            return new DomainArgs(appId, autoSubDomainCreationPatterns, autoSubDomainIAMRole, domainName, enableAutoSubDomain, subDomainSettings);
        }
    }
}
