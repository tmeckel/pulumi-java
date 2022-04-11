// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderAssumeRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderAssumeRoleArgs Empty = new ProviderAssumeRoleArgs();

    @Import(name="durationSeconds")
      private final @Nullable Output<Integer> durationSeconds;

    public Output<Integer> getDurationSeconds() {
        return this.durationSeconds == null ? Codegen.empty() : this.durationSeconds;
    }

    @Import(name="externalId")
      private final @Nullable Output<String> externalId;

    public Output<String> getExternalId() {
        return this.externalId == null ? Codegen.empty() : this.externalId;
    }

    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    @Import(name="policyArns")
      private final @Nullable Output<List<String>> policyArns;

    public Output<List<String>> getPolicyArns() {
        return this.policyArns == null ? Codegen.empty() : this.policyArns;
    }

    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    @Import(name="sessionName")
      private final @Nullable Output<String> sessionName;

    public Output<String> getSessionName() {
        return this.sessionName == null ? Codegen.empty() : this.sessionName;
    }

    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="transitiveTagKeys")
      private final @Nullable Output<List<String>> transitiveTagKeys;

    public Output<List<String>> getTransitiveTagKeys() {
        return this.transitiveTagKeys == null ? Codegen.empty() : this.transitiveTagKeys;
    }

    public ProviderAssumeRoleArgs(
        @Nullable Output<Integer> durationSeconds,
        @Nullable Output<String> externalId,
        @Nullable Output<String> policy,
        @Nullable Output<List<String>> policyArns,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> sessionName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<String>> transitiveTagKeys) {
        this.durationSeconds = durationSeconds;
        this.externalId = externalId;
        this.policy = policy;
        this.policyArns = policyArns;
        this.roleArn = roleArn;
        this.sessionName = sessionName;
        this.tags = tags;
        this.transitiveTagKeys = transitiveTagKeys;
    }

    private ProviderAssumeRoleArgs() {
        this.durationSeconds = Codegen.empty();
        this.externalId = Codegen.empty();
        this.policy = Codegen.empty();
        this.policyArns = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.sessionName = Codegen.empty();
        this.tags = Codegen.empty();
        this.transitiveTagKeys = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderAssumeRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> durationSeconds;
        private @Nullable Output<String> externalId;
        private @Nullable Output<String> policy;
        private @Nullable Output<List<String>> policyArns;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> sessionName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> transitiveTagKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderAssumeRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.externalId = defaults.externalId;
    	      this.policy = defaults.policy;
    	      this.policyArns = defaults.policyArns;
    	      this.roleArn = defaults.roleArn;
    	      this.sessionName = defaults.sessionName;
    	      this.tags = defaults.tags;
    	      this.transitiveTagKeys = defaults.transitiveTagKeys;
        }

        public Builder durationSeconds(@Nullable Output<Integer> durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        public Builder durationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = Codegen.ofNullable(durationSeconds);
            return this;
        }
        public Builder externalId(@Nullable Output<String> externalId) {
            this.externalId = externalId;
            return this;
        }
        public Builder externalId(@Nullable String externalId) {
            this.externalId = Codegen.ofNullable(externalId);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder policyArns(@Nullable Output<List<String>> policyArns) {
            this.policyArns = policyArns;
            return this;
        }
        public Builder policyArns(@Nullable List<String> policyArns) {
            this.policyArns = Codegen.ofNullable(policyArns);
            return this;
        }
        public Builder policyArns(String... policyArns) {
            return policyArns(List.of(policyArns));
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }
        public Builder sessionName(@Nullable Output<String> sessionName) {
            this.sessionName = sessionName;
            return this;
        }
        public Builder sessionName(@Nullable String sessionName) {
            this.sessionName = Codegen.ofNullable(sessionName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder transitiveTagKeys(@Nullable Output<List<String>> transitiveTagKeys) {
            this.transitiveTagKeys = transitiveTagKeys;
            return this;
        }
        public Builder transitiveTagKeys(@Nullable List<String> transitiveTagKeys) {
            this.transitiveTagKeys = Codegen.ofNullable(transitiveTagKeys);
            return this;
        }
        public Builder transitiveTagKeys(String... transitiveTagKeys) {
            return transitiveTagKeys(List.of(transitiveTagKeys));
        }        public ProviderAssumeRoleArgs build() {
            return new ProviderAssumeRoleArgs(durationSeconds, externalId, policy, policyArns, roleArn, sessionName, tags, transitiveTagKeys);
        }
    }
}
