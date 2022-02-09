// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiOAuthSettingsParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiOAuthSettingsParameterArgs Empty = new ApiOAuthSettingsParameterArgs();

    @InputImport(name="options")
    private final @Nullable Input<Object> options;

    public Input<Object> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    @InputImport(name="uiDefinition")
    private final @Nullable Input<Object> uiDefinition;

    public Input<Object> getUiDefinition() {
        return this.uiDefinition == null ? Input.empty() : this.uiDefinition;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ApiOAuthSettingsParameterArgs(
        @Nullable Input<Object> options,
        @Nullable Input<Object> uiDefinition,
        @Nullable Input<String> value) {
        this.options = options;
        this.uiDefinition = uiDefinition;
        this.value = value;
    }

    private ApiOAuthSettingsParameterArgs() {
        this.options = Input.empty();
        this.uiDefinition = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOAuthSettingsParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> options;
        private @Nullable Input<Object> uiDefinition;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiOAuthSettingsParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
    	      this.uiDefinition = defaults.uiDefinition;
    	      this.value = defaults.value;
        }

        public Builder setOptions(@Nullable Input<Object> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable Object options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setUiDefinition(@Nullable Input<Object> uiDefinition) {
            this.uiDefinition = uiDefinition;
            return this;
        }

        public Builder setUiDefinition(@Nullable Object uiDefinition) {
            this.uiDefinition = Input.ofNullable(uiDefinition);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public ApiOAuthSettingsParameterArgs build() {
            return new ApiOAuthSettingsParameterArgs(options, uiDefinition, value);
        }
    }
}
