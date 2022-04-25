// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.DataPrivacyProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBotResult {
    private final @Nullable String arn;
    /**
     * @return Data privacy setting of the Bot.
     * 
     */
    private final @Nullable DataPrivacyProperties dataPrivacy;
    private final @Nullable String description;
    private final @Nullable String id;
    /**
     * @return IdleSessionTTLInSeconds of the resource
     * 
     */
    private final @Nullable Integer idleSessionTTLInSeconds;
    private final @Nullable String name;
    private final @Nullable String roleArn;

    @CustomType.Constructor
    private GetBotResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("dataPrivacy") @Nullable DataPrivacyProperties dataPrivacy,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("idleSessionTTLInSeconds") @Nullable Integer idleSessionTTLInSeconds,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("roleArn") @Nullable String roleArn) {
        this.arn = arn;
        this.dataPrivacy = dataPrivacy;
        this.description = description;
        this.id = id;
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
        this.name = name;
        this.roleArn = roleArn;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Data privacy setting of the Bot.
     * 
     */
    public Optional<DataPrivacyProperties> dataPrivacy() {
        return Optional.ofNullable(this.dataPrivacy);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return IdleSessionTTLInSeconds of the resource
     * 
     */
    public Optional<Integer> idleSessionTTLInSeconds() {
        return Optional.ofNullable(this.idleSessionTTLInSeconds);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable DataPrivacyProperties dataPrivacy;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable Integer idleSessionTTLInSeconds;
        private @Nullable String name;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataPrivacy = defaults.dataPrivacy;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.idleSessionTTLInSeconds = defaults.idleSessionTTLInSeconds;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder dataPrivacy(@Nullable DataPrivacyProperties dataPrivacy) {
            this.dataPrivacy = dataPrivacy;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder idleSessionTTLInSeconds(@Nullable Integer idleSessionTTLInSeconds) {
            this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }        public GetBotResult build() {
            return new GetBotResult(arn, dataPrivacy, description, id, idleSessionTTLInSeconds, name, roleArn);
        }
    }
}
