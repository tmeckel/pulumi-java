// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.IndexJsonTokenTypeConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.IndexJwtTokenTypeConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexUserTokenConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexUserTokenConfigurationArgs Empty = new IndexUserTokenConfigurationArgs();

    @InputImport(name="jsonTokenTypeConfiguration")
      private final @Nullable Input<IndexJsonTokenTypeConfigurationArgs> jsonTokenTypeConfiguration;

    public Input<IndexJsonTokenTypeConfigurationArgs> getJsonTokenTypeConfiguration() {
        return this.jsonTokenTypeConfiguration == null ? Input.empty() : this.jsonTokenTypeConfiguration;
    }

    @InputImport(name="jwtTokenTypeConfiguration")
      private final @Nullable Input<IndexJwtTokenTypeConfigurationArgs> jwtTokenTypeConfiguration;

    public Input<IndexJwtTokenTypeConfigurationArgs> getJwtTokenTypeConfiguration() {
        return this.jwtTokenTypeConfiguration == null ? Input.empty() : this.jwtTokenTypeConfiguration;
    }

    public IndexUserTokenConfigurationArgs(
        @Nullable Input<IndexJsonTokenTypeConfigurationArgs> jsonTokenTypeConfiguration,
        @Nullable Input<IndexJwtTokenTypeConfigurationArgs> jwtTokenTypeConfiguration) {
        this.jsonTokenTypeConfiguration = jsonTokenTypeConfiguration;
        this.jwtTokenTypeConfiguration = jwtTokenTypeConfiguration;
    }

    private IndexUserTokenConfigurationArgs() {
        this.jsonTokenTypeConfiguration = Input.empty();
        this.jwtTokenTypeConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexUserTokenConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IndexJsonTokenTypeConfigurationArgs> jsonTokenTypeConfiguration;
        private @Nullable Input<IndexJwtTokenTypeConfigurationArgs> jwtTokenTypeConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexUserTokenConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonTokenTypeConfiguration = defaults.jsonTokenTypeConfiguration;
    	      this.jwtTokenTypeConfiguration = defaults.jwtTokenTypeConfiguration;
        }

        public Builder jsonTokenTypeConfiguration(@Nullable Input<IndexJsonTokenTypeConfigurationArgs> jsonTokenTypeConfiguration) {
            this.jsonTokenTypeConfiguration = jsonTokenTypeConfiguration;
            return this;
        }

        public Builder jsonTokenTypeConfiguration(@Nullable IndexJsonTokenTypeConfigurationArgs jsonTokenTypeConfiguration) {
            this.jsonTokenTypeConfiguration = Input.ofNullable(jsonTokenTypeConfiguration);
            return this;
        }

        public Builder jwtTokenTypeConfiguration(@Nullable Input<IndexJwtTokenTypeConfigurationArgs> jwtTokenTypeConfiguration) {
            this.jwtTokenTypeConfiguration = jwtTokenTypeConfiguration;
            return this;
        }

        public Builder jwtTokenTypeConfiguration(@Nullable IndexJwtTokenTypeConfigurationArgs jwtTokenTypeConfiguration) {
            this.jwtTokenTypeConfiguration = Input.ofNullable(jwtTokenTypeConfiguration);
            return this;
        }
        public IndexUserTokenConfigurationArgs build() {
            return new IndexUserTokenConfigurationArgs(jsonTokenTypeConfiguration, jwtTokenTypeConfiguration);
        }
    }
}
