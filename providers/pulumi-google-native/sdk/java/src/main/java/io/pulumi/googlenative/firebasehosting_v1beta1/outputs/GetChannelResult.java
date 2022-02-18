// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.ReleaseResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetChannelResult {
    /**
     * The time at which the channel was created.
     * 
     */
    private final String createTime;
    /**
     * The time at which the channel will be automatically deleted. If null, the channel will not be automatically deleted. This field is present in the output whether it's set directly or via the `ttl` field.
     * 
     */
    private final String expireTime;
    /**
     * Text labels used for extra metadata and/or filtering.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The fully-qualified resource name for the channel, in the format: sites/ SITE_ID/channels/CHANNEL_ID
     * 
     */
    private final String name;
    /**
     * The current release for the channel, if any.
     * 
     */
    private final ReleaseResponse release;
    /**
     * The number of previous releases to retain on the channel for rollback or other purposes. Must be a number between 1-100. Defaults to 10 for new channels.
     * 
     */
    private final Integer retainedReleaseCount;
    /**
     * Input only. A time-to-live for this channel. Sets `expire_time` to the provided duration past the time of the request.
     * 
     */
    private final String ttl;
    /**
     * The time at which the channel was last updated.
     * 
     */
    private final String updateTime;
    /**
     * The URL at which the content of this channel's current release can be viewed. This URL is a Firebase-provided subdomain of `web.app`. The content of this channel's current release can also be viewed at the Firebase-provided subdomain of `firebaseapp.com`. If this channel is the `live` channel for the Hosting site, then the content of this channel's current release can also be viewed at any connected custom domains.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"createTime","expireTime","labels","name","release","retainedReleaseCount","ttl","updateTime","url"})
    private GetChannelResult(
        String createTime,
        String expireTime,
        Map<String,String> labels,
        String name,
        ReleaseResponse release,
        Integer retainedReleaseCount,
        String ttl,
        String updateTime,
        String url) {
        this.createTime = Objects.requireNonNull(createTime);
        this.expireTime = Objects.requireNonNull(expireTime);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.release = Objects.requireNonNull(release);
        this.retainedReleaseCount = Objects.requireNonNull(retainedReleaseCount);
        this.ttl = Objects.requireNonNull(ttl);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * The time at which the channel was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The time at which the channel will be automatically deleted. If null, the channel will not be automatically deleted. This field is present in the output whether it's set directly or via the `ttl` field.
     * 
     */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * Text labels used for extra metadata and/or filtering.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The fully-qualified resource name for the channel, in the format: sites/ SITE_ID/channels/CHANNEL_ID
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The current release for the channel, if any.
     * 
     */
    public ReleaseResponse getRelease() {
        return this.release;
    }
    /**
     * The number of previous releases to retain on the channel for rollback or other purposes. Must be a number between 1-100. Defaults to 10 for new channels.
     * 
     */
    public Integer getRetainedReleaseCount() {
        return this.retainedReleaseCount;
    }
    /**
     * Input only. A time-to-live for this channel. Sets `expire_time` to the provided duration past the time of the request.
     * 
     */
    public String getTtl() {
        return this.ttl;
    }
    /**
     * The time at which the channel was last updated.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The URL at which the content of this channel's current release can be viewed. This URL is a Firebase-provided subdomain of `web.app`. The content of this channel's current release can also be viewed at the Firebase-provided subdomain of `firebaseapp.com`. If this channel is the `live` channel for the Hosting site, then the content of this channel's current release can also be viewed at any connected custom domains.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String expireTime;
        private Map<String,String> labels;
        private String name;
        private ReleaseResponse release;
        private Integer retainedReleaseCount;
        private String ttl;
        private String updateTime;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.release = defaults.release;
    	      this.retainedReleaseCount = defaults.retainedReleaseCount;
    	      this.ttl = defaults.ttl;
    	      this.updateTime = defaults.updateTime;
    	      this.url = defaults.url;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRelease(ReleaseResponse release) {
            this.release = Objects.requireNonNull(release);
            return this;
        }

        public Builder setRetainedReleaseCount(Integer retainedReleaseCount) {
            this.retainedReleaseCount = Objects.requireNonNull(retainedReleaseCount);
            return this;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public GetChannelResult build() {
            return new GetChannelResult(createTime, expireTime, labels, name, release, retainedReleaseCount, ttl, updateTime, url);
        }
    }
}
