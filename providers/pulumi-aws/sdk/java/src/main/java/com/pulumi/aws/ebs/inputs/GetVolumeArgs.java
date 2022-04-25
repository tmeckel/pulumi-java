// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.inputs;

import com.pulumi.aws.ebs.inputs.GetVolumeFilter;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeArgs Empty = new GetVolumeArgs();

    /**
     * One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-volumes in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVolumeFilter> filters;

    /**
     * @return One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-volumes in the AWS CLI reference][1].
     * 
     */
    public Optional<List<GetVolumeFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * If more than one result is returned, use the most
     * recent Volume.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Boolean mostRecent;

    /**
     * @return If more than one result is returned, use the most
     * recent Volume.
     * 
     */
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * A map of tags for the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags for the resource.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetVolumeArgs() {}

    private GetVolumeArgs(GetVolumeArgs $) {
        this.filters = $.filters;
        this.mostRecent = $.mostRecent;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeArgs $;

        public Builder() {
            $ = new GetVolumeArgs();
        }

        public Builder(GetVolumeArgs defaults) {
            $ = new GetVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There are
         * several valid keys, for a full reference, check out
         * [describe-volumes in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetVolumeFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There are
         * several valid keys, for a full reference, check out
         * [describe-volumes in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVolumeFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param mostRecent If more than one result is returned, use the most
         * recent Volume.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param tags A map of tags for the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetVolumeArgs build() {
            return $;
        }
    }

}
