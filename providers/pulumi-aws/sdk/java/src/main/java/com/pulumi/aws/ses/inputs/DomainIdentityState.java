// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainIdentityState extends com.pulumi.resources.ResourceArgs {

    public static final DomainIdentityState Empty = new DomainIdentityState();

    /**
     * The ARN of the domain identity.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the domain identity.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The domain name to assign to SES
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain name to assign to SES
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * A code which when added to the domain as a TXT record
     * will signal to SES that the owner of the domain has authorised SES to act on
     * their behalf. The domain identity will be in state &#34;verification pending&#34;
     * until this is done. See below for an example of how this might be achieved
     * when the domain is hosted in Route 53 and managed by this provider.  Find out
     * more about verifying domains in Amazon SES in the [AWS SES
     * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
     * 
     */
    @Import(name="verificationToken")
    private @Nullable Output<String> verificationToken;

    /**
     * @return A code which when added to the domain as a TXT record
     * will signal to SES that the owner of the domain has authorised SES to act on
     * their behalf. The domain identity will be in state &#34;verification pending&#34;
     * until this is done. See below for an example of how this might be achieved
     * when the domain is hosted in Route 53 and managed by this provider.  Find out
     * more about verifying domains in Amazon SES in the [AWS SES
     * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
     * 
     */
    public Optional<Output<String>> verificationToken() {
        return Optional.ofNullable(this.verificationToken);
    }

    private DomainIdentityState() {}

    private DomainIdentityState(DomainIdentityState $) {
        this.arn = $.arn;
        this.domain = $.domain;
        this.verificationToken = $.verificationToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainIdentityState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainIdentityState $;

        public Builder() {
            $ = new DomainIdentityState();
        }

        public Builder(DomainIdentityState defaults) {
            $ = new DomainIdentityState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the domain identity.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the domain identity.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param domain The domain name to assign to SES
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain name to assign to SES
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param verificationToken A code which when added to the domain as a TXT record
         * will signal to SES that the owner of the domain has authorised SES to act on
         * their behalf. The domain identity will be in state &#34;verification pending&#34;
         * until this is done. See below for an example of how this might be achieved
         * when the domain is hosted in Route 53 and managed by this provider.  Find out
         * more about verifying domains in Amazon SES in the [AWS SES
         * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
         * 
         * @return builder
         * 
         */
        public Builder verificationToken(@Nullable Output<String> verificationToken) {
            $.verificationToken = verificationToken;
            return this;
        }

        /**
         * @param verificationToken A code which when added to the domain as a TXT record
         * will signal to SES that the owner of the domain has authorised SES to act on
         * their behalf. The domain identity will be in state &#34;verification pending&#34;
         * until this is done. See below for an example of how this might be achieved
         * when the domain is hosted in Route 53 and managed by this provider.  Find out
         * more about verifying domains in Amazon SES in the [AWS SES
         * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
         * 
         * @return builder
         * 
         */
        public Builder verificationToken(String verificationToken) {
            return verificationToken(Output.of(verificationToken));
        }

        public DomainIdentityState build() {
            return $;
        }
    }

}
