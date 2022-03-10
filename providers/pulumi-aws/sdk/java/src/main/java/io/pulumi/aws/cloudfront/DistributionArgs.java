// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.aws.cloudfront.inputs.DistributionCustomErrorResponseArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionLoggingConfigArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginGroupArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionRestrictionsArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionViewerCertificateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionArgs Empty = new DistributionArgs();

    /**
     * Extra CNAMEs (alternate domain names), if any, for
     * this distribution.
     * 
     */
    @InputImport(name="aliases")
      private final @Nullable Input<List<String>> aliases;

    public Input<List<String>> getAliases() {
        return this.aliases == null ? Input.empty() : this.aliases;
    }

    /**
     * Any comments you want to include about the
     * distribution.
     * 
     */
    @InputImport(name="comment")
      private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * One or more custom error response elements (multiples allowed).
     * 
     */
    @InputImport(name="customErrorResponses")
      private final @Nullable Input<List<DistributionCustomErrorResponseArgs>> customErrorResponses;

    public Input<List<DistributionCustomErrorResponseArgs>> getCustomErrorResponses() {
        return this.customErrorResponses == null ? Input.empty() : this.customErrorResponses;
    }

    /**
     * The default cache behavior for this distribution (maximum
     * one).
     * 
     */
    @InputImport(name="defaultCacheBehavior", required=true)
      private final Input<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior;

    public Input<DistributionDefaultCacheBehaviorArgs> getDefaultCacheBehavior() {
        return this.defaultCacheBehavior;
    }

    /**
     * The object that you want CloudFront to
     * return (for example, index.html) when an end user requests the root URL.
     * 
     */
    @InputImport(name="defaultRootObject")
      private final @Nullable Input<String> defaultRootObject;

    public Input<String> getDefaultRootObject() {
        return this.defaultRootObject == null ? Input.empty() : this.defaultRootObject;
    }

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The maximum HTTP version to support on the
     * distribution. Allowed values are `http1.1` and `http2`. The default is
     * `http2`.
     * 
     */
    @InputImport(name="httpVersion")
      private final @Nullable Input<String> httpVersion;

    public Input<String> getHttpVersion() {
        return this.httpVersion == null ? Input.empty() : this.httpVersion;
    }

    /**
     * Whether the IPv6 is enabled for the distribution.
     * 
     */
    @InputImport(name="isIpv6Enabled")
      private final @Nullable Input<Boolean> isIpv6Enabled;

    public Input<Boolean> getIsIpv6Enabled() {
        return this.isIpv6Enabled == null ? Input.empty() : this.isIpv6Enabled;
    }

    /**
     * The logging
     * configuration that controls how logs are written
     * to your distribution (maximum one).
     * 
     */
    @InputImport(name="loggingConfig")
      private final @Nullable Input<DistributionLoggingConfigArgs> loggingConfig;

    public Input<DistributionLoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * An ordered list of cache behaviors
     * resource for this distribution. List from top to bottom
     * in order of precedence. The topmost cache behavior will have precedence 0.
     * 
     */
    @InputImport(name="orderedCacheBehaviors")
      private final @Nullable Input<List<DistributionOrderedCacheBehaviorArgs>> orderedCacheBehaviors;

    public Input<List<DistributionOrderedCacheBehaviorArgs>> getOrderedCacheBehaviors() {
        return this.orderedCacheBehaviors == null ? Input.empty() : this.orderedCacheBehaviors;
    }

    /**
     * One or more origin_group for this
     * distribution (multiples allowed).
     * 
     */
    @InputImport(name="originGroups")
      private final @Nullable Input<List<DistributionOriginGroupArgs>> originGroups;

    public Input<List<DistributionOriginGroupArgs>> getOriginGroups() {
        return this.originGroups == null ? Input.empty() : this.originGroups;
    }

    /**
     * One or more origins for this
     * distribution (multiples allowed).
     * 
     */
    @InputImport(name="origins", required=true)
      private final Input<List<DistributionOriginArgs>> origins;

    public Input<List<DistributionOriginArgs>> getOrigins() {
        return this.origins;
    }

    /**
     * The price class for this distribution. One of
     * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
     * 
     */
    @InputImport(name="priceClass")
      private final @Nullable Input<String> priceClass;

    public Input<String> getPriceClass() {
        return this.priceClass == null ? Input.empty() : this.priceClass;
    }

    /**
     * The restriction
     * configuration for this distribution (maximum one).
     * 
     */
    @InputImport(name="restrictions", required=true)
      private final Input<DistributionRestrictionsArgs> restrictions;

    public Input<DistributionRestrictionsArgs> getRestrictions() {
        return this.restrictions;
    }

    /**
     * Disables the distribution instead of
     * deleting it when destroying the resource. If this is set,
     * the distribution needs to be deleted manually afterwards. Default: `false`.
     * 
     */
    @InputImport(name="retainOnDelete")
      private final @Nullable Input<Boolean> retainOnDelete;

    public Input<Boolean> getRetainOnDelete() {
        return this.retainOnDelete == null ? Input.empty() : this.retainOnDelete;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The SSL
     * configuration for this distribution (maximum
     * one).
     * 
     */
    @InputImport(name="viewerCertificate", required=true)
      private final Input<DistributionViewerCertificateArgs> viewerCertificate;

    public Input<DistributionViewerCertificateArgs> getViewerCertificate() {
        return this.viewerCertificate;
    }

    /**
     * If enabled, the resource will wait for
     * the distribution status to change from `InProgress` to `Deployed`. Setting
     * this to`false` will skip the process. Default: `true`.
     * 
     */
    @InputImport(name="waitForDeployment")
      private final @Nullable Input<Boolean> waitForDeployment;

    public Input<Boolean> getWaitForDeployment() {
        return this.waitForDeployment == null ? Input.empty() : this.waitForDeployment;
    }

    /**
     * A unique identifier that specifies the AWS WAF web ACL,
     * if any, to associate with this distribution.
     * To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
     * for example `aws_wafv2_web_acl.example.arn`. To specify a web
     * ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
     * The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
     * credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
     * 
     */
    @InputImport(name="webAclId")
      private final @Nullable Input<String> webAclId;

    public Input<String> getWebAclId() {
        return this.webAclId == null ? Input.empty() : this.webAclId;
    }

    public DistributionArgs(
        @Nullable Input<List<String>> aliases,
        @Nullable Input<String> comment,
        @Nullable Input<List<DistributionCustomErrorResponseArgs>> customErrorResponses,
        Input<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior,
        @Nullable Input<String> defaultRootObject,
        Input<Boolean> enabled,
        @Nullable Input<String> httpVersion,
        @Nullable Input<Boolean> isIpv6Enabled,
        @Nullable Input<DistributionLoggingConfigArgs> loggingConfig,
        @Nullable Input<List<DistributionOrderedCacheBehaviorArgs>> orderedCacheBehaviors,
        @Nullable Input<List<DistributionOriginGroupArgs>> originGroups,
        Input<List<DistributionOriginArgs>> origins,
        @Nullable Input<String> priceClass,
        Input<DistributionRestrictionsArgs> restrictions,
        @Nullable Input<Boolean> retainOnDelete,
        @Nullable Input<Map<String,String>> tags,
        Input<DistributionViewerCertificateArgs> viewerCertificate,
        @Nullable Input<Boolean> waitForDeployment,
        @Nullable Input<String> webAclId) {
        this.aliases = aliases;
        this.comment = comment;
        this.customErrorResponses = customErrorResponses;
        this.defaultCacheBehavior = Objects.requireNonNull(defaultCacheBehavior, "expected parameter 'defaultCacheBehavior' to be non-null");
        this.defaultRootObject = defaultRootObject;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.httpVersion = httpVersion;
        this.isIpv6Enabled = isIpv6Enabled;
        this.loggingConfig = loggingConfig;
        this.orderedCacheBehaviors = orderedCacheBehaviors;
        this.originGroups = originGroups;
        this.origins = Objects.requireNonNull(origins, "expected parameter 'origins' to be non-null");
        this.priceClass = priceClass;
        this.restrictions = Objects.requireNonNull(restrictions, "expected parameter 'restrictions' to be non-null");
        this.retainOnDelete = retainOnDelete;
        this.tags = tags;
        this.viewerCertificate = Objects.requireNonNull(viewerCertificate, "expected parameter 'viewerCertificate' to be non-null");
        this.waitForDeployment = waitForDeployment;
        this.webAclId = webAclId;
    }

    private DistributionArgs() {
        this.aliases = Input.empty();
        this.comment = Input.empty();
        this.customErrorResponses = Input.empty();
        this.defaultCacheBehavior = Input.empty();
        this.defaultRootObject = Input.empty();
        this.enabled = Input.empty();
        this.httpVersion = Input.empty();
        this.isIpv6Enabled = Input.empty();
        this.loggingConfig = Input.empty();
        this.orderedCacheBehaviors = Input.empty();
        this.originGroups = Input.empty();
        this.origins = Input.empty();
        this.priceClass = Input.empty();
        this.restrictions = Input.empty();
        this.retainOnDelete = Input.empty();
        this.tags = Input.empty();
        this.viewerCertificate = Input.empty();
        this.waitForDeployment = Input.empty();
        this.webAclId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> aliases;
        private @Nullable Input<String> comment;
        private @Nullable Input<List<DistributionCustomErrorResponseArgs>> customErrorResponses;
        private Input<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior;
        private @Nullable Input<String> defaultRootObject;
        private Input<Boolean> enabled;
        private @Nullable Input<String> httpVersion;
        private @Nullable Input<Boolean> isIpv6Enabled;
        private @Nullable Input<DistributionLoggingConfigArgs> loggingConfig;
        private @Nullable Input<List<DistributionOrderedCacheBehaviorArgs>> orderedCacheBehaviors;
        private @Nullable Input<List<DistributionOriginGroupArgs>> originGroups;
        private Input<List<DistributionOriginArgs>> origins;
        private @Nullable Input<String> priceClass;
        private Input<DistributionRestrictionsArgs> restrictions;
        private @Nullable Input<Boolean> retainOnDelete;
        private @Nullable Input<Map<String,String>> tags;
        private Input<DistributionViewerCertificateArgs> viewerCertificate;
        private @Nullable Input<Boolean> waitForDeployment;
        private @Nullable Input<String> webAclId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.comment = defaults.comment;
    	      this.customErrorResponses = defaults.customErrorResponses;
    	      this.defaultCacheBehavior = defaults.defaultCacheBehavior;
    	      this.defaultRootObject = defaults.defaultRootObject;
    	      this.enabled = defaults.enabled;
    	      this.httpVersion = defaults.httpVersion;
    	      this.isIpv6Enabled = defaults.isIpv6Enabled;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.orderedCacheBehaviors = defaults.orderedCacheBehaviors;
    	      this.originGroups = defaults.originGroups;
    	      this.origins = defaults.origins;
    	      this.priceClass = defaults.priceClass;
    	      this.restrictions = defaults.restrictions;
    	      this.retainOnDelete = defaults.retainOnDelete;
    	      this.tags = defaults.tags;
    	      this.viewerCertificate = defaults.viewerCertificate;
    	      this.waitForDeployment = defaults.waitForDeployment;
    	      this.webAclId = defaults.webAclId;
        }

        public Builder aliases(@Nullable Input<List<String>> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder aliases(@Nullable List<String> aliases) {
            this.aliases = Input.ofNullable(aliases);
            return this;
        }

        public Builder comment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder customErrorResponses(@Nullable Input<List<DistributionCustomErrorResponseArgs>> customErrorResponses) {
            this.customErrorResponses = customErrorResponses;
            return this;
        }

        public Builder customErrorResponses(@Nullable List<DistributionCustomErrorResponseArgs> customErrorResponses) {
            this.customErrorResponses = Input.ofNullable(customErrorResponses);
            return this;
        }

        public Builder defaultCacheBehavior(Input<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior) {
            this.defaultCacheBehavior = Objects.requireNonNull(defaultCacheBehavior);
            return this;
        }

        public Builder defaultCacheBehavior(DistributionDefaultCacheBehaviorArgs defaultCacheBehavior) {
            this.defaultCacheBehavior = Input.of(Objects.requireNonNull(defaultCacheBehavior));
            return this;
        }

        public Builder defaultRootObject(@Nullable Input<String> defaultRootObject) {
            this.defaultRootObject = defaultRootObject;
            return this;
        }

        public Builder defaultRootObject(@Nullable String defaultRootObject) {
            this.defaultRootObject = Input.ofNullable(defaultRootObject);
            return this;
        }

        public Builder enabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder httpVersion(@Nullable Input<String> httpVersion) {
            this.httpVersion = httpVersion;
            return this;
        }

        public Builder httpVersion(@Nullable String httpVersion) {
            this.httpVersion = Input.ofNullable(httpVersion);
            return this;
        }

        public Builder isIpv6Enabled(@Nullable Input<Boolean> isIpv6Enabled) {
            this.isIpv6Enabled = isIpv6Enabled;
            return this;
        }

        public Builder isIpv6Enabled(@Nullable Boolean isIpv6Enabled) {
            this.isIpv6Enabled = Input.ofNullable(isIpv6Enabled);
            return this;
        }

        public Builder loggingConfig(@Nullable Input<DistributionLoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(@Nullable DistributionLoggingConfigArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
            return this;
        }

        public Builder orderedCacheBehaviors(@Nullable Input<List<DistributionOrderedCacheBehaviorArgs>> orderedCacheBehaviors) {
            this.orderedCacheBehaviors = orderedCacheBehaviors;
            return this;
        }

        public Builder orderedCacheBehaviors(@Nullable List<DistributionOrderedCacheBehaviorArgs> orderedCacheBehaviors) {
            this.orderedCacheBehaviors = Input.ofNullable(orderedCacheBehaviors);
            return this;
        }

        public Builder originGroups(@Nullable Input<List<DistributionOriginGroupArgs>> originGroups) {
            this.originGroups = originGroups;
            return this;
        }

        public Builder originGroups(@Nullable List<DistributionOriginGroupArgs> originGroups) {
            this.originGroups = Input.ofNullable(originGroups);
            return this;
        }

        public Builder origins(Input<List<DistributionOriginArgs>> origins) {
            this.origins = Objects.requireNonNull(origins);
            return this;
        }

        public Builder origins(List<DistributionOriginArgs> origins) {
            this.origins = Input.of(Objects.requireNonNull(origins));
            return this;
        }

        public Builder priceClass(@Nullable Input<String> priceClass) {
            this.priceClass = priceClass;
            return this;
        }

        public Builder priceClass(@Nullable String priceClass) {
            this.priceClass = Input.ofNullable(priceClass);
            return this;
        }

        public Builder restrictions(Input<DistributionRestrictionsArgs> restrictions) {
            this.restrictions = Objects.requireNonNull(restrictions);
            return this;
        }

        public Builder restrictions(DistributionRestrictionsArgs restrictions) {
            this.restrictions = Input.of(Objects.requireNonNull(restrictions));
            return this;
        }

        public Builder retainOnDelete(@Nullable Input<Boolean> retainOnDelete) {
            this.retainOnDelete = retainOnDelete;
            return this;
        }

        public Builder retainOnDelete(@Nullable Boolean retainOnDelete) {
            this.retainOnDelete = Input.ofNullable(retainOnDelete);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder viewerCertificate(Input<DistributionViewerCertificateArgs> viewerCertificate) {
            this.viewerCertificate = Objects.requireNonNull(viewerCertificate);
            return this;
        }

        public Builder viewerCertificate(DistributionViewerCertificateArgs viewerCertificate) {
            this.viewerCertificate = Input.of(Objects.requireNonNull(viewerCertificate));
            return this;
        }

        public Builder waitForDeployment(@Nullable Input<Boolean> waitForDeployment) {
            this.waitForDeployment = waitForDeployment;
            return this;
        }

        public Builder waitForDeployment(@Nullable Boolean waitForDeployment) {
            this.waitForDeployment = Input.ofNullable(waitForDeployment);
            return this;
        }

        public Builder webAclId(@Nullable Input<String> webAclId) {
            this.webAclId = webAclId;
            return this;
        }

        public Builder webAclId(@Nullable String webAclId) {
            this.webAclId = Input.ofNullable(webAclId);
            return this;
        }
        public DistributionArgs build() {
            return new DistributionArgs(aliases, comment, customErrorResponses, defaultCacheBehavior, defaultRootObject, enabled, httpVersion, isIpv6Enabled, loggingConfig, orderedCacheBehaviors, originGroups, origins, priceClass, restrictions, retainOnDelete, tags, viewerCertificate, waitForDeployment, webAclId);
        }
    }
}
