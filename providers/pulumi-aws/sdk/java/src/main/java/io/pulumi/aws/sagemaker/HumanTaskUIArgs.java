// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HumanTaskUIArgs extends io.pulumi.resources.ResourceArgs {

    public static final HumanTaskUIArgs Empty = new HumanTaskUIArgs();

    /**
     * The name of the Human Task UI.
     * 
     */
    @InputImport(name="humanTaskUiName", required=true)
      private final Input<String> humanTaskUiName;

    public Input<String> getHumanTaskUiName() {
        return this.humanTaskUiName;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The Liquid template for the worker user interface. See UI Template below.
     * 
     */
    @InputImport(name="uiTemplate", required=true)
      private final Input<HumanTaskUIUiTemplateArgs> uiTemplate;

    public Input<HumanTaskUIUiTemplateArgs> getUiTemplate() {
        return this.uiTemplate;
    }

    public HumanTaskUIArgs(
        Input<String> humanTaskUiName,
        @Nullable Input<Map<String,String>> tags,
        Input<HumanTaskUIUiTemplateArgs> uiTemplate) {
        this.humanTaskUiName = Objects.requireNonNull(humanTaskUiName, "expected parameter 'humanTaskUiName' to be non-null");
        this.tags = tags;
        this.uiTemplate = Objects.requireNonNull(uiTemplate, "expected parameter 'uiTemplate' to be non-null");
    }

    private HumanTaskUIArgs() {
        this.humanTaskUiName = Input.empty();
        this.tags = Input.empty();
        this.uiTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HumanTaskUIArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> humanTaskUiName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<HumanTaskUIUiTemplateArgs> uiTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(HumanTaskUIArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanTaskUiName = defaults.humanTaskUiName;
    	      this.tags = defaults.tags;
    	      this.uiTemplate = defaults.uiTemplate;
        }

        public Builder humanTaskUiName(Input<String> humanTaskUiName) {
            this.humanTaskUiName = Objects.requireNonNull(humanTaskUiName);
            return this;
        }

        public Builder humanTaskUiName(String humanTaskUiName) {
            this.humanTaskUiName = Input.of(Objects.requireNonNull(humanTaskUiName));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder uiTemplate(Input<HumanTaskUIUiTemplateArgs> uiTemplate) {
            this.uiTemplate = Objects.requireNonNull(uiTemplate);
            return this;
        }

        public Builder uiTemplate(HumanTaskUIUiTemplateArgs uiTemplate) {
            this.uiTemplate = Input.of(Objects.requireNonNull(uiTemplate));
            return this;
        }
        public HumanTaskUIArgs build() {
            return new HumanTaskUIArgs(humanTaskUiName, tags, uiTemplate);
        }
    }
}
