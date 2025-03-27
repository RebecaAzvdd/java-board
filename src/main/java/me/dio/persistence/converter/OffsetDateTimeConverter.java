package me.dio.persistence.converter;

import static lombok.AccessLevel.PRIVATE;


import lombok.NoArgsConstructor;

import static java.time.ZoneOffset.UTC;
import java.sql.Timestamp;
import static java.util.Objects.nonNull;
import java.time.OffsetDateTime;

@NoArgsConstructor(access = PRIVATE)
public final class OffsetDateTimeConverter {

    public static OffsetDateTime toOffsetDateTime(final Timestamp value){
        return nonNull(value) ? OffsetDateTime.ofInstant(value.toInstant(), UTC) : null;
    }

    public static Timestamp toTimestamp(final OffsetDateTime value){
        return nonNull(value) ? Timestamp.valueOf(value.atZoneSameInstant(UTC).toLocalDateTime()) : null;
    }
}
