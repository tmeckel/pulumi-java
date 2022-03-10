// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationIncrementalPullConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationIncrementalPullConfigArgs Empty = new IntegrationIncrementalPullConfigArgs();

    @InputImport(name="datetimeTypeFieldName")
      private final @Nullable Input<String> datetimeTypeFieldName;

    public Input<String> getDatetimeTypeFieldName() {
        return this.datetimeTypeFieldName == null ? Input.empty() : this.datetimeTypeFieldName;
    }

    public IntegrationIncrementalPullConfigArgs(@Nullable Input<String> datetimeTypeFieldName) {
        this.datetimeTypeFieldName = datetimeTypeFieldName;
    }

    private IntegrationIncrementalPullConfigArgs() {
        this.datetimeTypeFieldName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationIncrementalPullConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datetimeTypeFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationIncrementalPullConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datetimeTypeFieldName = defaults.datetimeTypeFieldName;
        }

        public Builder datetimeTypeFieldName(@Nullable Input<String> datetimeTypeFieldName) {
            this.datetimeTypeFieldName = datetimeTypeFieldName;
            return this;
        }

        public Builder datetimeTypeFieldName(@Nullable String datetimeTypeFieldName) {
            this.datetimeTypeFieldName = Input.ofNullable(datetimeTypeFieldName);
            return this;
        }
        public IntegrationIncrementalPullConfigArgs build() {
            return new IntegrationIncrementalPullConfigArgs(datetimeTypeFieldName);
        }
    }
}
