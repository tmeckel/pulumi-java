// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UsagePlanKeyState extends io.pulumi.resources.ResourceArgs {

    public static final UsagePlanKeyState Empty = new UsagePlanKeyState();

    /**
     * The identifier of the API key resource.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId == null ? Codegen.empty() : this.keyId;
    }

    /**
     * The type of the API key resource. Currently, the valid key type is API_KEY.
     * 
     */
    @Import(name="keyType")
      private final @Nullable Output<String> keyType;

    public Output<String> getKeyType() {
        return this.keyType == null ? Codegen.empty() : this.keyType;
    }

    /**
     * The name of a usage plan key.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The Id of the usage plan resource representing to associate the key to.
     * 
     */
    @Import(name="usagePlanId")
      private final @Nullable Output<String> usagePlanId;

    public Output<String> getUsagePlanId() {
        return this.usagePlanId == null ? Codegen.empty() : this.usagePlanId;
    }

    /**
     * The value of a usage plan key.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public UsagePlanKeyState(
        @Nullable Output<String> keyId,
        @Nullable Output<String> keyType,
        @Nullable Output<String> name,
        @Nullable Output<String> usagePlanId,
        @Nullable Output<String> value) {
        this.keyId = keyId;
        this.keyType = keyType;
        this.name = name;
        this.usagePlanId = usagePlanId;
        this.value = value;
    }

    private UsagePlanKeyState() {
        this.keyId = Codegen.empty();
        this.keyType = Codegen.empty();
        this.name = Codegen.empty();
        this.usagePlanId = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> keyType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> usagePlanId;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keyType = defaults.keyType;
    	      this.name = defaults.name;
    	      this.usagePlanId = defaults.usagePlanId;
    	      this.value = defaults.value;
        }

        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Codegen.ofNullable(keyId);
            return this;
        }
        public Builder keyType(@Nullable Output<String> keyType) {
            this.keyType = keyType;
            return this;
        }
        public Builder keyType(@Nullable String keyType) {
            this.keyType = Codegen.ofNullable(keyType);
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
        public Builder usagePlanId(@Nullable Output<String> usagePlanId) {
            this.usagePlanId = usagePlanId;
            return this;
        }
        public Builder usagePlanId(@Nullable String usagePlanId) {
            this.usagePlanId = Codegen.ofNullable(usagePlanId);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public UsagePlanKeyState build() {
            return new UsagePlanKeyState(keyId, keyType, name, usagePlanId, value);
        }
    }
}
