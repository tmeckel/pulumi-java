// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.aws.backup.inputs.SelectionConditionStringEqualArgs;
import io.pulumi.aws.backup.inputs.SelectionConditionStringLikeArgs;
import io.pulumi.aws.backup.inputs.SelectionConditionStringNotEqualArgs;
import io.pulumi.aws.backup.inputs.SelectionConditionStringNotLikeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SelectionConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectionConditionArgs Empty = new SelectionConditionArgs();

    @InputImport(name="stringEquals")
      private final @Nullable Input<List<SelectionConditionStringEqualArgs>> stringEquals;

    public Input<List<SelectionConditionStringEqualArgs>> getStringEquals() {
        return this.stringEquals == null ? Input.empty() : this.stringEquals;
    }

    @InputImport(name="stringLikes")
      private final @Nullable Input<List<SelectionConditionStringLikeArgs>> stringLikes;

    public Input<List<SelectionConditionStringLikeArgs>> getStringLikes() {
        return this.stringLikes == null ? Input.empty() : this.stringLikes;
    }

    @InputImport(name="stringNotEquals")
      private final @Nullable Input<List<SelectionConditionStringNotEqualArgs>> stringNotEquals;

    public Input<List<SelectionConditionStringNotEqualArgs>> getStringNotEquals() {
        return this.stringNotEquals == null ? Input.empty() : this.stringNotEquals;
    }

    @InputImport(name="stringNotLikes")
      private final @Nullable Input<List<SelectionConditionStringNotLikeArgs>> stringNotLikes;

    public Input<List<SelectionConditionStringNotLikeArgs>> getStringNotLikes() {
        return this.stringNotLikes == null ? Input.empty() : this.stringNotLikes;
    }

    public SelectionConditionArgs(
        @Nullable Input<List<SelectionConditionStringEqualArgs>> stringEquals,
        @Nullable Input<List<SelectionConditionStringLikeArgs>> stringLikes,
        @Nullable Input<List<SelectionConditionStringNotEqualArgs>> stringNotEquals,
        @Nullable Input<List<SelectionConditionStringNotLikeArgs>> stringNotLikes) {
        this.stringEquals = stringEquals;
        this.stringLikes = stringLikes;
        this.stringNotEquals = stringNotEquals;
        this.stringNotLikes = stringNotLikes;
    }

    private SelectionConditionArgs() {
        this.stringEquals = Input.empty();
        this.stringLikes = Input.empty();
        this.stringNotEquals = Input.empty();
        this.stringNotLikes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SelectionConditionStringEqualArgs>> stringEquals;
        private @Nullable Input<List<SelectionConditionStringLikeArgs>> stringLikes;
        private @Nullable Input<List<SelectionConditionStringNotEqualArgs>> stringNotEquals;
        private @Nullable Input<List<SelectionConditionStringNotLikeArgs>> stringNotLikes;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectionConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stringEquals = defaults.stringEquals;
    	      this.stringLikes = defaults.stringLikes;
    	      this.stringNotEquals = defaults.stringNotEquals;
    	      this.stringNotLikes = defaults.stringNotLikes;
        }

        public Builder stringEquals(@Nullable Input<List<SelectionConditionStringEqualArgs>> stringEquals) {
            this.stringEquals = stringEquals;
            return this;
        }

        public Builder stringEquals(@Nullable List<SelectionConditionStringEqualArgs> stringEquals) {
            this.stringEquals = Input.ofNullable(stringEquals);
            return this;
        }

        public Builder stringLikes(@Nullable Input<List<SelectionConditionStringLikeArgs>> stringLikes) {
            this.stringLikes = stringLikes;
            return this;
        }

        public Builder stringLikes(@Nullable List<SelectionConditionStringLikeArgs> stringLikes) {
            this.stringLikes = Input.ofNullable(stringLikes);
            return this;
        }

        public Builder stringNotEquals(@Nullable Input<List<SelectionConditionStringNotEqualArgs>> stringNotEquals) {
            this.stringNotEquals = stringNotEquals;
            return this;
        }

        public Builder stringNotEquals(@Nullable List<SelectionConditionStringNotEqualArgs> stringNotEquals) {
            this.stringNotEquals = Input.ofNullable(stringNotEquals);
            return this;
        }

        public Builder stringNotLikes(@Nullable Input<List<SelectionConditionStringNotLikeArgs>> stringNotLikes) {
            this.stringNotLikes = stringNotLikes;
            return this;
        }

        public Builder stringNotLikes(@Nullable List<SelectionConditionStringNotLikeArgs> stringNotLikes) {
            this.stringNotLikes = Input.ofNullable(stringNotLikes);
            return this;
        }
        public SelectionConditionArgs build() {
            return new SelectionConditionArgs(stringEquals, stringLikes, stringNotEquals, stringNotLikes);
        }
    }
}
