// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An **entity entry** for an associated entity type.
 * 
 */
public final class GoogleCloudDialogflowV2beta1EntityTypeEntityArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1EntityTypeEntityArgs Empty = new GoogleCloudDialogflowV2beta1EntityTypeEntityArgs();

    /**
     * A collection of value synonyms. For example, if the entity type is *vegetable*, and `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This collection must contain exactly one synonym equal to `value`.
     * 
     */
    @InputImport(name="synonyms", required=true)
      private final Input<List<String>> synonyms;

    public Input<List<String>> getSynonyms() {
        return this.synonyms;
    }

    /**
     * The primary value associated with this entity entry. For example, if the entity type is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A reference value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can contain references to other entity types (with or without aliases).
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public GoogleCloudDialogflowV2beta1EntityTypeEntityArgs(
        Input<List<String>> synonyms,
        Input<String> value) {
        this.synonyms = Objects.requireNonNull(synonyms, "expected parameter 'synonyms' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1EntityTypeEntityArgs() {
        this.synonyms = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1EntityTypeEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> synonyms;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1EntityTypeEntityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder synonyms(Input<List<String>> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }

        public Builder synonyms(List<String> synonyms) {
            this.synonyms = Input.of(Objects.requireNonNull(synonyms));
            return this;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public GoogleCloudDialogflowV2beta1EntityTypeEntityArgs build() {
            return new GoogleCloudDialogflowV2beta1EntityTypeEntityArgs(synonyms, value);
        }
    }
}
