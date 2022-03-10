// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Object to define the number of days after object last modification Or last access. Properties daysAfterModificationGreaterThan and daysAfterLastAccessTimeGreaterThan are mutually exclusive.
 * 
 */
public final class DateAfterModificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DateAfterModificationResponse Empty = new DateAfterModificationResponse();

    /**
     * Value indicating the age in days after last blob access. This property can only be used in conjunction with last access time tracking policy
     * 
     */
    @InputImport(name="daysAfterLastAccessTimeGreaterThan")
      private final @Nullable Double daysAfterLastAccessTimeGreaterThan;

    public Optional<Double> getDaysAfterLastAccessTimeGreaterThan() {
        return this.daysAfterLastAccessTimeGreaterThan == null ? Optional.empty() : Optional.ofNullable(this.daysAfterLastAccessTimeGreaterThan);
    }

    /**
     * Value indicating the age in days after last modification
     * 
     */
    @InputImport(name="daysAfterModificationGreaterThan")
      private final @Nullable Double daysAfterModificationGreaterThan;

    public Optional<Double> getDaysAfterModificationGreaterThan() {
        return this.daysAfterModificationGreaterThan == null ? Optional.empty() : Optional.ofNullable(this.daysAfterModificationGreaterThan);
    }

    public DateAfterModificationResponse(
        @Nullable Double daysAfterLastAccessTimeGreaterThan,
        @Nullable Double daysAfterModificationGreaterThan) {
        this.daysAfterLastAccessTimeGreaterThan = daysAfterLastAccessTimeGreaterThan;
        this.daysAfterModificationGreaterThan = daysAfterModificationGreaterThan;
    }

    private DateAfterModificationResponse() {
        this.daysAfterLastAccessTimeGreaterThan = null;
        this.daysAfterModificationGreaterThan = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DateAfterModificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double daysAfterLastAccessTimeGreaterThan;
        private @Nullable Double daysAfterModificationGreaterThan;

        public Builder() {
    	      // Empty
        }

        public Builder(DateAfterModificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterLastAccessTimeGreaterThan = defaults.daysAfterLastAccessTimeGreaterThan;
    	      this.daysAfterModificationGreaterThan = defaults.daysAfterModificationGreaterThan;
        }

        public Builder daysAfterLastAccessTimeGreaterThan(@Nullable Double daysAfterLastAccessTimeGreaterThan) {
            this.daysAfterLastAccessTimeGreaterThan = daysAfterLastAccessTimeGreaterThan;
            return this;
        }

        public Builder daysAfterModificationGreaterThan(@Nullable Double daysAfterModificationGreaterThan) {
            this.daysAfterModificationGreaterThan = daysAfterModificationGreaterThan;
            return this;
        }
        public DateAfterModificationResponse build() {
            return new DateAfterModificationResponse(daysAfterLastAccessTimeGreaterThan, daysAfterModificationGreaterThan);
        }
    }
}
