// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DWCopyCommandDefaultValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DW Copy Command settings.
 * 
 */
public final class DWCopyCommandSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DWCopyCommandSettingsArgs Empty = new DWCopyCommandSettingsArgs();

    /**
     * Additional options directly passed to SQL DW in Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalOptions": { "MAXERRORS": "1000", "DATEFORMAT": "'ymd'" }
     * 
     */
    @InputImport(name="additionalOptions")
      private final @Nullable Input<Map<String,String>> additionalOptions;

    public Input<Map<String,String>> getAdditionalOptions() {
        return this.additionalOptions == null ? Input.empty() : this.additionalOptions;
    }

    /**
     * Specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="defaultValues")
      private final @Nullable Input<List<DWCopyCommandDefaultValueArgs>> defaultValues;

    public Input<List<DWCopyCommandDefaultValueArgs>> getDefaultValues() {
        return this.defaultValues == null ? Input.empty() : this.defaultValues;
    }

    public DWCopyCommandSettingsArgs(
        @Nullable Input<Map<String,String>> additionalOptions,
        @Nullable Input<List<DWCopyCommandDefaultValueArgs>> defaultValues) {
        this.additionalOptions = additionalOptions;
        this.defaultValues = defaultValues;
    }

    private DWCopyCommandSettingsArgs() {
        this.additionalOptions = Input.empty();
        this.defaultValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DWCopyCommandSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> additionalOptions;
        private @Nullable Input<List<DWCopyCommandDefaultValueArgs>> defaultValues;

        public Builder() {
    	      // Empty
        }

        public Builder(DWCopyCommandSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalOptions = defaults.additionalOptions;
    	      this.defaultValues = defaults.defaultValues;
        }

        public Builder additionalOptions(@Nullable Input<Map<String,String>> additionalOptions) {
            this.additionalOptions = additionalOptions;
            return this;
        }

        public Builder additionalOptions(@Nullable Map<String,String> additionalOptions) {
            this.additionalOptions = Input.ofNullable(additionalOptions);
            return this;
        }

        public Builder defaultValues(@Nullable Input<List<DWCopyCommandDefaultValueArgs>> defaultValues) {
            this.defaultValues = defaultValues;
            return this;
        }

        public Builder defaultValues(@Nullable List<DWCopyCommandDefaultValueArgs> defaultValues) {
            this.defaultValues = Input.ofNullable(defaultValues);
            return this;
        }
        public DWCopyCommandSettingsArgs build() {
            return new DWCopyCommandSettingsArgs(additionalOptions, defaultValues);
        }
    }
}
