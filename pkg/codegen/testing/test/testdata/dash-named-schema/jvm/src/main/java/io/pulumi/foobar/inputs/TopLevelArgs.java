// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foobar.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopLevelArgs Empty = new TopLevelArgs();

    @InputImport(name="buzz")
      private final @Nullable Input<String> buzz;

    public Input<String> getBuzz() {
        return this.buzz == null ? Input.empty() : this.buzz;
    }

    public TopLevelArgs(@Nullable Input<String> buzz) {
        this.buzz = buzz;
    }

    private TopLevelArgs() {
        this.buzz = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> buzz;

        public Builder() {
    	      // Empty
        }

        public Builder(TopLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buzz = defaults.buzz;
        }

        public Builder buzz(@Nullable Input<String> buzz) {
            this.buzz = buzz;
            return this;
        }

        public Builder buzz(@Nullable String buzz) {
            this.buzz = Input.ofNullable(buzz);
            return this;
        }
        public TopLevelArgs build() {
            return new TopLevelArgs(buzz);
        }
    }
}
