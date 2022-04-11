// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetVersioningConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetVersioningConfigurationArgs Empty = new DatasetVersioningConfigurationArgs();

    @Import(name="maxVersions")
      private final @Nullable Output<Integer> maxVersions;

    public Output<Integer> getMaxVersions() {
        return this.maxVersions == null ? Codegen.empty() : this.maxVersions;
    }

    @Import(name="unlimited")
      private final @Nullable Output<Boolean> unlimited;

    public Output<Boolean> getUnlimited() {
        return this.unlimited == null ? Codegen.empty() : this.unlimited;
    }

    public DatasetVersioningConfigurationArgs(
        @Nullable Output<Integer> maxVersions,
        @Nullable Output<Boolean> unlimited) {
        this.maxVersions = maxVersions;
        this.unlimited = unlimited;
    }

    private DatasetVersioningConfigurationArgs() {
        this.maxVersions = Codegen.empty();
        this.unlimited = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetVersioningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxVersions;
        private @Nullable Output<Boolean> unlimited;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetVersioningConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxVersions = defaults.maxVersions;
    	      this.unlimited = defaults.unlimited;
        }

        public Builder maxVersions(@Nullable Output<Integer> maxVersions) {
            this.maxVersions = maxVersions;
            return this;
        }
        public Builder maxVersions(@Nullable Integer maxVersions) {
            this.maxVersions = Codegen.ofNullable(maxVersions);
            return this;
        }
        public Builder unlimited(@Nullable Output<Boolean> unlimited) {
            this.unlimited = unlimited;
            return this;
        }
        public Builder unlimited(@Nullable Boolean unlimited) {
            this.unlimited = Codegen.ofNullable(unlimited);
            return this;
        }        public DatasetVersioningConfigurationArgs build() {
            return new DatasetVersioningConfigurationArgs(maxVersions, unlimited);
        }
    }
}
