// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActivationState extends io.pulumi.resources.ResourceArgs {

    public static final ActivationState Empty = new ActivationState();

    /**
     * The code the system generates when it processes the activation.
     * 
     */
    @Import(name="activationCode")
      private final @Nullable Output<String> activationCode;

    public Output<String> getActivationCode() {
        return this.activationCode == null ? Codegen.empty() : this.activationCode;
    }

    /**
     * The description of the resource that you want to register.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="expirationDate")
      private final @Nullable Output<String> expirationDate;

    public Output<String> getExpirationDate() {
        return this.expirationDate == null ? Codegen.empty() : this.expirationDate;
    }

    /**
     * If the current activation has expired.
     * 
     */
    @Import(name="expired")
      private final @Nullable Output<Boolean> expired;

    public Output<Boolean> getExpired() {
        return this.expired == null ? Codegen.empty() : this.expired;
    }

    /**
     * The IAM Role to attach to the managed instance.
     * 
     */
    @Import(name="iamRole")
      private final @Nullable Output<String> iamRole;

    public Output<String> getIamRole() {
        return this.iamRole == null ? Codegen.empty() : this.iamRole;
    }

    /**
     * The default name of the registered managed instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The number of managed instances that are currently registered using this activation.
     * 
     */
    @Import(name="registrationCount")
      private final @Nullable Output<Integer> registrationCount;

    public Output<Integer> getRegistrationCount() {
        return this.registrationCount == null ? Codegen.empty() : this.registrationCount;
    }

    /**
     * The maximum number of managed instances you want to register. The default value is 1 instance.
     * 
     */
    @Import(name="registrationLimit")
      private final @Nullable Output<Integer> registrationLimit;

    public Output<Integer> getRegistrationLimit() {
        return this.registrationLimit == null ? Codegen.empty() : this.registrationLimit;
    }

    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ActivationState(
        @Nullable Output<String> activationCode,
        @Nullable Output<String> description,
        @Nullable Output<String> expirationDate,
        @Nullable Output<Boolean> expired,
        @Nullable Output<String> iamRole,
        @Nullable Output<String> name,
        @Nullable Output<Integer> registrationCount,
        @Nullable Output<Integer> registrationLimit,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.activationCode = activationCode;
        this.description = description;
        this.expirationDate = expirationDate;
        this.expired = expired;
        this.iamRole = iamRole;
        this.name = name;
        this.registrationCount = registrationCount;
        this.registrationLimit = registrationLimit;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ActivationState() {
        this.activationCode = Codegen.empty();
        this.description = Codegen.empty();
        this.expirationDate = Codegen.empty();
        this.expired = Codegen.empty();
        this.iamRole = Codegen.empty();
        this.name = Codegen.empty();
        this.registrationCount = Codegen.empty();
        this.registrationLimit = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activationCode;
        private @Nullable Output<String> description;
        private @Nullable Output<String> expirationDate;
        private @Nullable Output<Boolean> expired;
        private @Nullable Output<String> iamRole;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> registrationCount;
        private @Nullable Output<Integer> registrationLimit;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationCode = defaults.activationCode;
    	      this.description = defaults.description;
    	      this.expirationDate = defaults.expirationDate;
    	      this.expired = defaults.expired;
    	      this.iamRole = defaults.iamRole;
    	      this.name = defaults.name;
    	      this.registrationCount = defaults.registrationCount;
    	      this.registrationLimit = defaults.registrationLimit;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder activationCode(@Nullable Output<String> activationCode) {
            this.activationCode = activationCode;
            return this;
        }
        public Builder activationCode(@Nullable String activationCode) {
            this.activationCode = Codegen.ofNullable(activationCode);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = Codegen.ofNullable(expirationDate);
            return this;
        }
        public Builder expired(@Nullable Output<Boolean> expired) {
            this.expired = expired;
            return this;
        }
        public Builder expired(@Nullable Boolean expired) {
            this.expired = Codegen.ofNullable(expired);
            return this;
        }
        public Builder iamRole(@Nullable Output<String> iamRole) {
            this.iamRole = iamRole;
            return this;
        }
        public Builder iamRole(@Nullable String iamRole) {
            this.iamRole = Codegen.ofNullable(iamRole);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder registrationCount(@Nullable Output<Integer> registrationCount) {
            this.registrationCount = registrationCount;
            return this;
        }
        public Builder registrationCount(@Nullable Integer registrationCount) {
            this.registrationCount = Codegen.ofNullable(registrationCount);
            return this;
        }
        public Builder registrationLimit(@Nullable Output<Integer> registrationLimit) {
            this.registrationLimit = registrationLimit;
            return this;
        }
        public Builder registrationLimit(@Nullable Integer registrationLimit) {
            this.registrationLimit = Codegen.ofNullable(registrationLimit);
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
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ActivationState build() {
            return new ActivationState(activationCode, description, expirationDate, expired, iamRole, name, registrationCount, registrationLimit, tags, tagsAll);
        }
    }
}
