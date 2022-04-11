// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class XssMatchSetState extends io.pulumi.resources.ResourceArgs {

    public static final XssMatchSetState Empty = new XssMatchSetState();

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The name or description of the SizeConstraintSet.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The parts of web requests that you want to inspect for cross-site scripting attacks.
     * 
     */
    @Import(name="xssMatchTuples")
      private final @Nullable Output<List<XssMatchSetXssMatchTupleGetArgs>> xssMatchTuples;

    public Output<List<XssMatchSetXssMatchTupleGetArgs>> getXssMatchTuples() {
        return this.xssMatchTuples == null ? Codegen.empty() : this.xssMatchTuples;
    }

    public XssMatchSetState(
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<List<XssMatchSetXssMatchTupleGetArgs>> xssMatchTuples) {
        this.arn = arn;
        this.name = name;
        this.xssMatchTuples = xssMatchTuples;
    }

    private XssMatchSetState() {
        this.arn = Codegen.empty();
        this.name = Codegen.empty();
        this.xssMatchTuples = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<XssMatchSetXssMatchTupleGetArgs>> xssMatchTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.xssMatchTuples = defaults.xssMatchTuples;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder xssMatchTuples(@Nullable Output<List<XssMatchSetXssMatchTupleGetArgs>> xssMatchTuples) {
            this.xssMatchTuples = xssMatchTuples;
            return this;
        }
        public Builder xssMatchTuples(@Nullable List<XssMatchSetXssMatchTupleGetArgs> xssMatchTuples) {
            this.xssMatchTuples = Codegen.ofNullable(xssMatchTuples);
            return this;
        }
        public Builder xssMatchTuples(XssMatchSetXssMatchTupleGetArgs... xssMatchTuples) {
            return xssMatchTuples(List.of(xssMatchTuples));
        }        public XssMatchSetState build() {
            return new XssMatchSetState(arn, name, xssMatchTuples);
        }
    }
}
