// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * A button to use on a response card used to gather slot values from a user.
 * 
 */
public final class BotButtonArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotButtonArgs Empty = new BotButtonArgs();

    /**
     * The text that appears on the button.
     * 
     */
    @Import(name="text", required=true)
      private final Output<String> text;

    public Output<String> getText() {
        return this.text;
    }

    /**
     * The value returned to Amazon Lex when the user chooses this button.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public BotButtonArgs(
        Output<String> text,
        Output<String> value) {
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private BotButtonArgs() {
        this.text = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotButtonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> text;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(BotButtonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        public Builder text(Output<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder text(String text) {
            this.text = Output.of(Objects.requireNonNull(text));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public BotButtonArgs build() {
            return new BotButtonArgs(text, value);
        }
    }
}
