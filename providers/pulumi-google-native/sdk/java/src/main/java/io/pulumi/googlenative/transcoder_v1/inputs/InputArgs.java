// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.PreprocessingConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input asset.
 * 
 */
public final class InputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InputArgs Empty = new InputArgs();

    /**
     * A unique key for this input. Must be specified when using advanced mapping and edit lists.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Preprocessing configurations.
     * 
     */
    @InputImport(name="preprocessingConfig")
    private final @Nullable Input<PreprocessingConfigArgs> preprocessingConfig;

    public Input<PreprocessingConfigArgs> getPreprocessingConfig() {
        return this.preprocessingConfig == null ? Input.empty() : this.preprocessingConfig;
    }

    /**
     * URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`). If empty, the value will be populated from `Job.input_uri`.
     * 
     */
    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public InputArgs(
        @Nullable Input<String> key,
        @Nullable Input<PreprocessingConfigArgs> preprocessingConfig,
        @Nullable Input<String> uri) {
        this.key = key;
        this.preprocessingConfig = preprocessingConfig;
        this.uri = uri;
    }

    private InputArgs() {
        this.key = Input.empty();
        this.preprocessingConfig = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private @Nullable Input<PreprocessingConfigArgs> preprocessingConfig;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(InputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.preprocessingConfig = defaults.preprocessingConfig;
    	      this.uri = defaults.uri;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setPreprocessingConfig(@Nullable Input<PreprocessingConfigArgs> preprocessingConfig) {
            this.preprocessingConfig = preprocessingConfig;
            return this;
        }

        public Builder setPreprocessingConfig(@Nullable PreprocessingConfigArgs preprocessingConfig) {
            this.preprocessingConfig = Input.ofNullable(preprocessingConfig);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public InputArgs build() {
            return new InputArgs(key, preprocessingConfig, uri);
        }
    }
}
