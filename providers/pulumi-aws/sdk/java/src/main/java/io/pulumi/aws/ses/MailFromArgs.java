// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MailFromArgs extends io.pulumi.resources.ResourceArgs {

    public static final MailFromArgs Empty = new MailFromArgs();

    /**
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
     * 
     */
    @Import(name="behaviorOnMxFailure")
      private final @Nullable Output<String> behaviorOnMxFailure;

    public Output<String> getBehaviorOnMxFailure() {
        return this.behaviorOnMxFailure == null ? Codegen.empty() : this.behaviorOnMxFailure;
    }

    /**
     * Verified domain name to generate DKIM tokens for.
     * 
     */
    @Import(name="domain", required=true)
      private final Output<String> domain;

    public Output<String> getDomain() {
        return this.domain;
    }

    /**
     * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
     * 
     */
    @Import(name="mailFromDomain", required=true)
      private final Output<String> mailFromDomain;

    public Output<String> getMailFromDomain() {
        return this.mailFromDomain;
    }

    public MailFromArgs(
        @Nullable Output<String> behaviorOnMxFailure,
        Output<String> domain,
        Output<String> mailFromDomain) {
        this.behaviorOnMxFailure = behaviorOnMxFailure;
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.mailFromDomain = Objects.requireNonNull(mailFromDomain, "expected parameter 'mailFromDomain' to be non-null");
    }

    private MailFromArgs() {
        this.behaviorOnMxFailure = Codegen.empty();
        this.domain = Codegen.empty();
        this.mailFromDomain = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MailFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> behaviorOnMxFailure;
        private Output<String> domain;
        private Output<String> mailFromDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(MailFromArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behaviorOnMxFailure = defaults.behaviorOnMxFailure;
    	      this.domain = defaults.domain;
    	      this.mailFromDomain = defaults.mailFromDomain;
        }

        public Builder behaviorOnMxFailure(@Nullable Output<String> behaviorOnMxFailure) {
            this.behaviorOnMxFailure = behaviorOnMxFailure;
            return this;
        }
        public Builder behaviorOnMxFailure(@Nullable String behaviorOnMxFailure) {
            this.behaviorOnMxFailure = Codegen.ofNullable(behaviorOnMxFailure);
            return this;
        }
        public Builder domain(Output<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }
        public Builder mailFromDomain(Output<String> mailFromDomain) {
            this.mailFromDomain = Objects.requireNonNull(mailFromDomain);
            return this;
        }
        public Builder mailFromDomain(String mailFromDomain) {
            this.mailFromDomain = Output.of(Objects.requireNonNull(mailFromDomain));
            return this;
        }        public MailFromArgs build() {
            return new MailFromArgs(behaviorOnMxFailure, domain, mailFromDomain);
        }
    }
}
