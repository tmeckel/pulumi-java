// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class XssMatchSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final XssMatchSetArgs Empty = new XssMatchSetArgs();

    /**
     * The name of the set
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The parts of web requests that you want to inspect for cross-site scripting attacks.
     * 
     */
    @InputImport(name="xssMatchTuples")
      private final @Nullable Input<List<XssMatchSetXssMatchTupleArgs>> xssMatchTuples;

    public Input<List<XssMatchSetXssMatchTupleArgs>> getXssMatchTuples() {
        return this.xssMatchTuples == null ? Input.empty() : this.xssMatchTuples;
    }

    public XssMatchSetArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<XssMatchSetXssMatchTupleArgs>> xssMatchTuples) {
        this.name = name;
        this.xssMatchTuples = xssMatchTuples;
    }

    private XssMatchSetArgs() {
        this.name = Input.empty();
        this.xssMatchTuples = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<XssMatchSetXssMatchTupleArgs>> xssMatchTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.xssMatchTuples = defaults.xssMatchTuples;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder xssMatchTuples(@Nullable Input<List<XssMatchSetXssMatchTupleArgs>> xssMatchTuples) {
            this.xssMatchTuples = xssMatchTuples;
            return this;
        }

        public Builder xssMatchTuples(@Nullable List<XssMatchSetXssMatchTupleArgs> xssMatchTuples) {
            this.xssMatchTuples = Input.ofNullable(xssMatchTuples);
            return this;
        }
        public XssMatchSetArgs build() {
            return new XssMatchSetArgs(name, xssMatchTuples);
        }
    }
}
