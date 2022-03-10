// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttachmentArgs Empty = new AttachmentArgs();

    /**
     * The name of the ELB.
     * 
     */
    @InputImport(name="elb", required=true)
      private final Input<String> elb;

    public Input<String> getElb() {
        return this.elb;
    }

    /**
     * Instance ID to place in the ELB pool.
     * 
     */
    @InputImport(name="instance", required=true)
      private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    public AttachmentArgs(
        Input<String> elb,
        Input<String> instance) {
        this.elb = Objects.requireNonNull(elb, "expected parameter 'elb' to be non-null");
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
    }

    private AttachmentArgs() {
        this.elb = Input.empty();
        this.instance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> elb;
        private Input<String> instance;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elb = defaults.elb;
    	      this.instance = defaults.instance;
        }

        public Builder elb(Input<String> elb) {
            this.elb = Objects.requireNonNull(elb);
            return this;
        }

        public Builder elb(String elb) {
            this.elb = Input.of(Objects.requireNonNull(elb));
            return this;
        }

        public Builder instance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder instance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }
        public AttachmentArgs build() {
            return new AttachmentArgs(elb, instance);
        }
    }
}
