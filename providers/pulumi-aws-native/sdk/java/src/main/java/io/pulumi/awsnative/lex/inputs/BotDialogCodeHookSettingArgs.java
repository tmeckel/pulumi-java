// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Settings that determine the Lambda function that Amazon Lex uses for processing user responses.
 * 
 */
public final class BotDialogCodeHookSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotDialogCodeHookSettingArgs Empty = new BotDialogCodeHookSettingArgs();

    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    public BotDialogCodeHookSettingArgs(Output<Boolean> enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private BotDialogCodeHookSettingArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotDialogCodeHookSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotDialogCodeHookSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }        public BotDialogCodeHookSettingArgs build() {
            return new BotDialogCodeHookSettingArgs(enabled);
        }
    }
}
