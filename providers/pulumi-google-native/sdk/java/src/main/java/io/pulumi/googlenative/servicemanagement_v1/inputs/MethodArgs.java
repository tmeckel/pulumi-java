// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.enums.MethodSyntax;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Method represents a method of an API interface.
 * 
 */
public final class MethodArgs extends io.pulumi.resources.ResourceArgs {

    public static final MethodArgs Empty = new MethodArgs();

    /**
     * The simple name of this method.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Any metadata attached to the method.
     * 
     */
    @InputImport(name="options")
    private final @Nullable Input<List<OptionArgs>> options;

    public Input<List<OptionArgs>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * If true, the request is streamed.
     * 
     */
    @InputImport(name="requestStreaming")
    private final @Nullable Input<Boolean> requestStreaming;

    public Input<Boolean> getRequestStreaming() {
        return this.requestStreaming == null ? Input.empty() : this.requestStreaming;
    }

    /**
     * A URL of the input message type.
     * 
     */
    @InputImport(name="requestTypeUrl")
    private final @Nullable Input<String> requestTypeUrl;

    public Input<String> getRequestTypeUrl() {
        return this.requestTypeUrl == null ? Input.empty() : this.requestTypeUrl;
    }

    /**
     * If true, the response is streamed.
     * 
     */
    @InputImport(name="responseStreaming")
    private final @Nullable Input<Boolean> responseStreaming;

    public Input<Boolean> getResponseStreaming() {
        return this.responseStreaming == null ? Input.empty() : this.responseStreaming;
    }

    /**
     * The URL of the output message type.
     * 
     */
    @InputImport(name="responseTypeUrl")
    private final @Nullable Input<String> responseTypeUrl;

    public Input<String> getResponseTypeUrl() {
        return this.responseTypeUrl == null ? Input.empty() : this.responseTypeUrl;
    }

    /**
     * The source syntax of this method.
     * 
     */
    @InputImport(name="syntax")
    private final @Nullable Input<MethodSyntax> syntax;

    public Input<MethodSyntax> getSyntax() {
        return this.syntax == null ? Input.empty() : this.syntax;
    }

    public MethodArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<OptionArgs>> options,
        @Nullable Input<Boolean> requestStreaming,
        @Nullable Input<String> requestTypeUrl,
        @Nullable Input<Boolean> responseStreaming,
        @Nullable Input<String> responseTypeUrl,
        @Nullable Input<MethodSyntax> syntax) {
        this.name = name;
        this.options = options;
        this.requestStreaming = requestStreaming;
        this.requestTypeUrl = requestTypeUrl;
        this.responseStreaming = responseStreaming;
        this.responseTypeUrl = responseTypeUrl;
        this.syntax = syntax;
    }

    private MethodArgs() {
        this.name = Input.empty();
        this.options = Input.empty();
        this.requestStreaming = Input.empty();
        this.requestTypeUrl = Input.empty();
        this.responseStreaming = Input.empty();
        this.responseTypeUrl = Input.empty();
        this.syntax = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<OptionArgs>> options;
        private @Nullable Input<Boolean> requestStreaming;
        private @Nullable Input<String> requestTypeUrl;
        private @Nullable Input<Boolean> responseStreaming;
        private @Nullable Input<String> responseTypeUrl;
        private @Nullable Input<MethodSyntax> syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.requestStreaming = defaults.requestStreaming;
    	      this.requestTypeUrl = defaults.requestTypeUrl;
    	      this.responseStreaming = defaults.responseStreaming;
    	      this.responseTypeUrl = defaults.responseTypeUrl;
    	      this.syntax = defaults.syntax;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOptions(@Nullable Input<List<OptionArgs>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable List<OptionArgs> options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setRequestStreaming(@Nullable Input<Boolean> requestStreaming) {
            this.requestStreaming = requestStreaming;
            return this;
        }

        public Builder setRequestStreaming(@Nullable Boolean requestStreaming) {
            this.requestStreaming = Input.ofNullable(requestStreaming);
            return this;
        }

        public Builder setRequestTypeUrl(@Nullable Input<String> requestTypeUrl) {
            this.requestTypeUrl = requestTypeUrl;
            return this;
        }

        public Builder setRequestTypeUrl(@Nullable String requestTypeUrl) {
            this.requestTypeUrl = Input.ofNullable(requestTypeUrl);
            return this;
        }

        public Builder setResponseStreaming(@Nullable Input<Boolean> responseStreaming) {
            this.responseStreaming = responseStreaming;
            return this;
        }

        public Builder setResponseStreaming(@Nullable Boolean responseStreaming) {
            this.responseStreaming = Input.ofNullable(responseStreaming);
            return this;
        }

        public Builder setResponseTypeUrl(@Nullable Input<String> responseTypeUrl) {
            this.responseTypeUrl = responseTypeUrl;
            return this;
        }

        public Builder setResponseTypeUrl(@Nullable String responseTypeUrl) {
            this.responseTypeUrl = Input.ofNullable(responseTypeUrl);
            return this;
        }

        public Builder setSyntax(@Nullable Input<MethodSyntax> syntax) {
            this.syntax = syntax;
            return this;
        }

        public Builder setSyntax(@Nullable MethodSyntax syntax) {
            this.syntax = Input.ofNullable(syntax);
            return this;
        }

        public MethodArgs build() {
            return new MethodArgs(name, options, requestStreaming, requestTypeUrl, responseStreaming, responseTypeUrl, syntax);
        }
    }
}
